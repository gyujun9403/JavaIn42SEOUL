package week02.second.prac.student;

public class Student {
	
	static int serialNum = 1000;
	int studentID;
	String studentName;
	
	Student(String studentName) {
		
		this.studentName = studentName;
		studentID = serialNum++;
	}
}
