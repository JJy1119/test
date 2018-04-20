package cn.freemud.framework;

/**
 * 基础框架异常
 * @author vh02
 *
 */
public class PlatformException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4537227666693414162L;
	
	/**
	 * 错误信息
	 */
	private String msg;
	
	public PlatformException(String msg) {
		this.msg = msg;
	}
	
	public PlatformException(Throwable e) {
		super(e);
		if(e != null) {
			this.msg = e.getMessage();
		}
	}
	/**
	 * 获取错误信息
	 */
	@Override
	public String getMessage() {
		if(msg == null) {
			return super.getMessage();
		}
		
		return msg;
	}

}
