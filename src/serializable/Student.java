package serializable;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private int dateOfBirth;
	private static final long serialVersionUID = 1L;

	public Student(int id, String name, int dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + '}';
	}
}
