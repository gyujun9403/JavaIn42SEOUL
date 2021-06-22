package week01.practice.student;

public class Student {
	int studentId; //줄여서 쓰기는 지양할 것.
	int grade;
	String studentName;
	//다른 클래스에서 생성자를 사용할 때 사용자가 확인하기 쉽기 때문에 매개변수와 프로퍼티 이름을 같게 
	Student(int studentId, int grade){
		
		this.studentId = studentId;
	}
	public void showProperty() {//이름을 만들때 호출하는 객체의 입장에 쓸것. get, set처럼...
		System.out.println(studentName + "'s grade is " + grade);
	}
}
