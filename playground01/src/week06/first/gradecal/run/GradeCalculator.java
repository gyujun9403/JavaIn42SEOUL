package week06.first.gradecal.run;

// 과목에 대해 출력하면 학생 객체에 대한 정보를 각각찾아서 출력하는 방식이 옳다... 과목 자체에서 성적을 결정하는 메소드를 넣는건 옳지 안핟.
// 솔리드 -> 하나의 클래스는 하나의 기능만 재공을 하게.. 클래스의 책임과 역할. 
// 과목의 기능이 성적을 계산하는 것은 아니기 때문에. 
// 출력도 따로 클래스를 만드는게 맞음. (인터페이스를 바탕으로?)
// 이러한 모델링을 한 성적 학생객체 들에서는 getter, setter메소드들이 대부분인게 많다.
// 학생의 점수를 서브젝트 안에 넣는건 좀 애매해다... 차라리 score라는 table을 따로 은 릴레이션 테이블에 학생번호, 과목번호, 점수를 저장? 수강을 등록한 정보를 저장...
// 추가되는 정보가 있다면 관계테이블을 만든다.(동적으로 관리되는 테이블. 학생의 각 학년별 정보, 시험성적 등등 계속 변해야하는것.)
public interface GradeCalculator {
	// 쿼리에서 가지고 온것을 각각의 객체에 넣어서 돌아갈 수 있게. (스튜던트 객체, 서브젝트 객체 따로따로 ...)
	// 아래와 같은 상수값을 하드코딩 x.. 파일같은데 따로 저장하는게 맞음. 
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "system";
	public static final String PASS = "oracle";
	// 인터페이스에는 메소드의 선언만을...
	/*
	** showTable method show table of sutudent info
	** It take variable argument 'args'. 'args' is Student's id.
	** showTable must be able show data which 'args' variable argument contain.
	** if 'args' contain keyword 'All', showTable method show all data.
	*/
	public void showTable(String subject, String ...studentsIds);
}
