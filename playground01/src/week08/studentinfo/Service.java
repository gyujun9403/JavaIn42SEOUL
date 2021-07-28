package week08.studentinfo;

import java.util.ArrayList;
import java.util.HashMap;

import week08.studentinfo.DAO.DAO;
import week08.studentinfo.DAO.OracleDAO;
import week08.studentinfo.viewer.MyViewer;
import week08.studentinfo.viewer.Viewer;

public class Service {
	DAO dao;
	Viewer viewer;
	ArrayList<StudentInfo> studentInfoList;
	ArrayList<Student> studentList;
	HashMap<String, Department> DepartmentMap;
	GradeData koreanGradeData;
	GradeData mathGradeData;
	public void setAllData() {
		dao = new OracleDAO();
		viewer = new MyViewer();
		studentInfoList = dao.getStudentInfoList();
		DepartmentMap = dao.getDepartmentList();
		if (DepartmentMap.isEmpty() || studentInfoList.isEmpty()) {
			viewer.printError();
			return ;
		}
		if (settingStudentMap() == false) {
			viewer.printError();
			return ;
		}
		koreanGradeData = dao.getKoreanGradeData();
		mathGradeData = dao.getMathGradeData();
	}
	
	public void printAllData(String subject) {
		if (dao == null)
			return ;
		if (subject.equals("korean"))
			viewer.printData(studentList, koreanGradeData);
		else if (subject.equals("math"))
			viewer.printData(studentList, mathGradeData);
		else
			viewer.printError();
	}
	
	private boolean settingStudentMap() {
		if (studentInfoList.isEmpty())
			return false;
		else
		{
			studentList = new ArrayList<Student>();
			for (int i = 0; i < studentInfoList.size(); i++) {
				Student temp = new Student(
						studentInfoList.get(i).getStudentId(),
						studentInfoList.get(i).getName(),
						DepartmentMap.get(studentInfoList.get(i).getDepartmentString())
						);
				studentList.add(temp);
			}
			return true;
		}
	}
}
