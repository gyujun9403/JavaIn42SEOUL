package week08.studentinfo.viewer;

import java.util.ArrayList;

import week08.studentinfo.GradeData;
import week08.studentinfo.Student;
import week08.studentinfo.calculator.Calculator;
import week08.studentinfo.calculator.Mycalculator;

public class MyViewer implements Viewer{

	@Override
	public void printError() {
		System.out.println("\n!!!! Error occur !!!!\n");
		
	}

	@Override
	public void printData(ArrayList<Student> studentList, GradeData gradData) {
		Calculator cal = new Mycalculator();
		printHeader(gradData.getSubjectName());
		for (Student student : studentList)
			printRow(student, 
					gradData.getScore(student.getStudentId()),
					cal.calculateScore(student, gradData));
		
	}
	
	private void printHeader(String subjectName) {
		System.out.println("-----------------------------------------\n"
				+ "\t" + subjectName + " 수강생 학점\n"
				+ " 이름\t| 학번\t\t| 중점과목\t| 점수\n"
				+ "=========================================");
	}
	private void printRow(Student student, int score, String grade) {
		System.out.println(student.getName() + "\t| " + student.getStudentId() + "\t| " 
				+ student.getDepartment().getCommonCore() + "\t| "
				+ score + ":" + grade + "\n"
				+ "-----------------------------------------");
	}
}
