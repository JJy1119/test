package cn.freemud.framework.caching.memory;

/**
 * Created by ax03 on 2017/3/6.
 */
public class CacheEntryHelper {
    private static final InheritableThreadLocal<CacheEntryStack> currentScopes = new InheritableThreadLocal<>();

    public static CacheEntryStack getScopes() {
        return currentScopes.get();
    }

    public static void setScopes(CacheEntryStack entry) {
        currentScopes.set(entry);
    }

    private static CacheEntryStack getOrCreateScopes() {
        CacheEntryStack scopes = CacheEntryHelper.getScopes();
        if (scopes == null) {
            scopes = CacheEntryStack.createEmpty();
            setScopes(scopes);
        }

        return scopes;
    }

    public static CacheEntry getCurrent() {
        CacheEntryStack stack = getOrCreateScopes();
        return stack.peek();
    }

    public static AutoCloseable EnterScope(CacheEntry entry) {
        CacheEntryStack scopes = getOrCreateScopes();

        ScopeLease scopeLease = new ScopeLease(scopes);
        CacheEntryStack stack = scopes.push(entry);
        CacheEntryHelper.setScopes(stack);
        return scopeLease;
    }


    private static final class ScopeLease implements AutoCloseable {
        private final CacheEntryStack cacheEntryStack;

        public ScopeLease(CacheEntryStack cacheEntryStack) {
            this.cacheEntryStack = cacheEntryStack;
        }

        @Override
        public void close() throws Exception {
            CacheEntryHelper.setScopes(cacheEntryStack);
        }
    }
}
