package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public boolean serialization(Student st, String fileName) {
		boolean flag = false;
		File f = new File(fileName);
		try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(st);
			flag = true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public Student deserialization(String fileName) throws InvalidObjectException {
		File fr = new File(fileName);
		try (FileInputStream fis = new FileInputStream(fr); ObjectInputStream ois = new ObjectInputStream(fis);) {

			Student st = (Student) ois.readObject();
			return st;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		throw new InvalidObjectException("Object not deserialized");
	}
}
