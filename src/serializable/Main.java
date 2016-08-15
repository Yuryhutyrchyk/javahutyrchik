package serializable;

import java.io.InvalidObjectException;

public class Main {
	public static void main(String[] args) {

		Student student = new Student(4, "Yriy", 6051980);
		System.out.println(student + "\n-----------------------");

		String file = "test.tmp";
		Serialization sz = new Serialization();
		boolean b = sz.serialization(student, file);
		System.out.println(b + "\n-----------------------");

		Student result = null;
		try {
			result = sz.deserialization(file);
		} catch (InvalidObjectException e) {
			e.printStackTrace();
		}
		System.out.println(result + "\n-----------------------");

	}
}
