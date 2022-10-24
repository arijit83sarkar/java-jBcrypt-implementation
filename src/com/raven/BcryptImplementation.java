package com.raven;

public class BcryptImplementation {
	private static int workload = 10;

	public static String generatePassword(String plainText) {
		String salt = BCrypt.gensalt(workload);
		String hashed_password = BCrypt.hashpw(plainText, salt);

		return (hashed_password);
	}

	public static boolean checkPassword(String plaintext, String storedHash) {
		boolean password_verified = false;

		if (null == storedHash || !storedHash.startsWith("$2a$"))
			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

		password_verified = BCrypt.checkpw(plaintext, storedHash);

		return (password_verified);
	}
}
