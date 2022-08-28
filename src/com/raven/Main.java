package com.raven;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BcryptImplementation bcryptImplementation = new BcryptImplementation();

		String test_passwd = "admin123";
		String test_hash = "$2a$06$.rCVZVOThsIa97pEDOxvGuRRgzG64bvtJ0938xuqzv18d3ZpQhstC";

		String generatedPassword = BcryptImplementation.generatePassword("admin123");
		System.out.println("Generated password :: " + generatedPassword);
		System.out.println("Check hash :: " + BcryptImplementation.checkPassword("admin123", generatedPassword));
	}
	
	// admin123 -> $2a$12$f2uZuYh1j9.Sq5OwCXZZp.JPP5vIegjlNuHcFMQ.4BNSBfdaH.1lq

}
