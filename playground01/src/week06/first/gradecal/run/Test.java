package week06.first.gradecal.run;

import week06.first.gradecal.outsourcing.GyeonGradeCal;

public class Test {

	public static void main(String[] args) {
		GradeCalculator cal = new GyeonGradeCal();
		cal.showTable("국어", "211213", "201290", "ALL");
		cal.showTable("국어", "211213", "201518");
		cal.showTable("수학", "ALL");
	}

}
