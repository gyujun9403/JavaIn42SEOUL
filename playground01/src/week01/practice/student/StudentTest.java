package week01.practice.student;

public class StudentTest {//public class는 .java클래스의 이름과 같아야 한다.

	public static void main(String[] args) {
		Student studentKim = new Student(12345, 1);
		studentKim.studentId = 12345;//이클립스 커맨드 스페이스 자동완성 만들어오기.fn + .
		studentKim.studentName = "킴";
		System.out.println(studentKim);
		//=System.out.println(studentKim.toString());
		//->week01.practice.student.Student@7c75222b
		// classname                  JVM이 32bit환경에서 컴파일 하한다. 해쉬코드드로 관리...
		//studentKim.
		//studentKim.showProperty();
	}

}
