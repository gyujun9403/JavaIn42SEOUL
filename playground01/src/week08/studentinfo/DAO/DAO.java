package week08.studentinfo.DAO;

import java.util.ArrayList;
import java.util.HashMap;

import week08.studentinfo.Department;
import week08.studentinfo.GradeData;
import week08.studentinfo.StudentInfo;

public interface DAO {
	public ArrayList<StudentInfo> getStudentInfoList();
	public HashMap<String, Department> getDepartmentList();
	public GradeData getKoreanGradeData();
	public GradeData getMathGradeData();
}
