package week08.studentinfo;

import java.util.HashMap;

public class GradeData {
	private String subjectName;
	private HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public GradeData(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void addScore(int studentId, int grade) {
		data.put(studentId, grade);
	}
	
	public int getScore(int studentId) {
		if (data.isEmpty())
			return -1;
		else {
			if (data.containsKey(studentId))
				return data.get(studentId);
			else
				return -1;
		}
	}
}
