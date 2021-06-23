package week03.first.exer.grade;

public class Subject {
	private String subjectName;
	private int grade;
	protected Subject(String subjectName, int grade) {
		this.subjectName = subjectName;
		this.grade = grade;
	}
	protected String getsubjectName() {
		return subjectName; 
	}
	protected int getgrade() {
		return grade; 
	}
}
