package cn.freemud.framework.utils;

import java.util.UUID;

/**
 * 生成uuid
 * @author vh02
 *
 */
public class UUidUtil {

	/**
	 * 生成uuid
	 * @return uuid
	 */
	public static String genUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String genVerifyCode(int len) {
		if(len <= 0) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<len; i++) {
			int x = (int)(Math.random() * 62);
			if(x < 10) {
				if(x > 1) {
					sb.append(x);
				} else {
				    i--;
				}
			} else if(x < 36) {
				char c = (char)('a' + x - 10);
				if(c != 'o' && c != 'i' && c != 'l') {
					sb.append(c);
				} else {
					i--;
				}
			} else {
				char c = (char)('A' + x - 36);
				if(c != 'O' && c != 'I') {
					sb.append(c);
				} else {
					i--;
				}
			}
		}
		
		return sb.toString();
	}
}
