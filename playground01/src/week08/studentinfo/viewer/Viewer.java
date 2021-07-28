package week08.studentinfo.viewer;

import java.util.ArrayList;

import week08.studentinfo.GradeData;
import week08.studentinfo.Student;

public interface Viewer {
	public void printError();
	public void printData(ArrayList<Student> studentList, GradeData gradData);
}
