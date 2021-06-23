package week03.first.exer.grade;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentNum;
	private ArrayList<Subject> registedSubject = new ArrayList<Subject>();
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	public void addSubject(String subjectName, int grade) {
		registedSubject.add(new Subject(subjectName, grade));
	}
	
	public void showStudentInfo() {
		int sum = 0;
		for (Subject subject : registedSubject) {
			int eachGrade = subject.getgrade();
			sum += eachGrade;
			System.out.println("학생 " + studentName +"의 "
					+ subject.getsubjectName() + "과목 성적은 "
					+ eachGrade + "입니다.");
		}
		System.out.println("학생 " + studentName +"의 총점은 " + sum + " 입니다.");
	}
}
