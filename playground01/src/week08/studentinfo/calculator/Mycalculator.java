package week08.studentinfo.calculator;

import week08.studentinfo.GradeData;
import week08.studentinfo.Student;

public class Mycalculator implements Calculator{

	@Override
	public String calculateScore(Student student, GradeData data) {
		if (student.getDepartment().getCommonCore() == data.getSubjectName())
			return commonCoreCal(data.getScore(student.getStudentId()));
		else
			return notCommonCoreCal(data.getScore(student.getStudentId()));
	}
	
	private String commonCoreCal(int score) {
		if (score >= 95)
			return "S";
		else if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "F";
	}
	
	private String notCommonCoreCal(int score) {
		if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 55)
			return "D";
		else
			return "F";
	}
}
