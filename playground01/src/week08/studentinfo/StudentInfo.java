package week08.studentinfo;

public class StudentInfo {
	private int studentId;
	private String name;
	private String departmentString;
	
	public StudentInfo (int studentId, String name, String departmentString) {
		this.studentId = studentId;
		this.name = name;
		this.departmentString = departmentString;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public String getDepartmentString() {
		return departmentString;
	}
}
