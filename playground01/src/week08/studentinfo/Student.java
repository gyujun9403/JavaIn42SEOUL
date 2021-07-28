package week08.studentinfo;

public class Student {
	private int studentId;
	private String name;
	private Department department;
	
	public Student(int studentId, String name, Department department) {
		this.studentId = studentId;
		this.name = name;
		this.department = department;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
