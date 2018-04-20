package cn.freemud.framework.utils;

import java.io.Serializable;
import java.security.MessageDigest;

/**
 * 加密工具类
 * @author vh02
 *
 */
public class EncryptUtil implements Serializable {

    private static final long serialVersionUID = -7128703687666202104L;

    /**
     * 加密方式
     */
    private static String ENCRYPT_TYPE = "MD5";

    /**
     * md5加密
     * @param str 字符串
     * @return 加密结果
     */
    public static String encrypt(String str) {
    	char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
        try {
            byte[] btInput = str.getBytes("UTF-8");
            
            MessageDigest mdInst = MessageDigest.getInstance(ENCRYPT_TYPE);

            mdInst.update(btInput);

            byte[] md = mdInst.digest();

            int j = md.length;
            char tmp[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                tmp[k++] = hexDigits[byte0 >>> 4 & 0xf];
                tmp[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(tmp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
