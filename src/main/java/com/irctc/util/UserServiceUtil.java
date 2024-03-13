package com.irctc.util;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

	public static String hassPassword(String plainPassword) {
		return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
	}
	
	public static Boolean checkPassword(String plainPassword, String hashPassword) {
		return BCrypt.checkpw(plainPassword, hashPassword);
	}
}
