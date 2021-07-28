package week06.first.gradecal.outsourcing;

import java.sql.*;
import week06.first.gradecal.run.GradeCalculator;

// 한클래스에 모든게 들어가있기 떄문에 자바적인 요소가 없다. 
public class GyeonGradeCal implements GradeCalculator{
	private Connection			conn;
	private PreparedStatement	pstmtStudent;
	private ResultSet			rsStudentInfo;
	private	String				sqlStudent;
	
	//DAO 부분.
	@Override
	public void showTable(String subject, String ...studentsIds) {
		try 
		{	
			Class.forName(JDBC_DRIVER); 							// JDBC 드라이버를 메모리에 올림
			conn = DriverManager.getConnection(URL, USER, PASS);	// 접속할 DB 정보로 Connection 객체 생성
	        sqlStudent = makeSql(studentsIds);						// 가변인가 값을 분석해서 sql 생성
	        pstmtStudent = conn.prepareStatement(sqlStudent);		// SELECT문, 테이블 내 데이터 조회
			rsStudentInfo = pstmtStudent.executeQuery();			// Query 반환값 ResultSet 객체 반환, SELECT 결과 저장 ResultSet 변수
			printTable(subject, rsStudentInfo);
		} catch (Exception e) {
            System.out.println(e);
        } finally {	// 예외와 상관없이 메모리에서 해제하기 위해 finally문에 작성
            try {	// 메모리 해제. close() 역시 예외 처리가 필요함
            	rsStudentInfo.close();
                pstmtStudent.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
	    }
	}
	
	private String claculateGrade(int score, String subject, String commonCore) {
		String result = null;
		
		if (subject.equals(commonCore)) {
			if (score >= 95) {result = "S";}
			else if (score >= 90) {result = "A";}
			else if (score >= 80) {result = "B";}
			else if (score >= 70) {result = "C";}
			else if (score >= 60) {result = "D";}
			else {result = "D";}
		}
		else {
			if (score >= 90) {result = "A";}
			else if (score >= 80) {result = "B";}
			else if (score >= 70) {result = "C";}
			else if (score >= 55) {result = "D";}
			else {result = "D";}
		}
		return result;
	}
	
	// xml파일등을 사용하는 경우가 많다. 이렇게 string으로 따로 하드코딩하지 않는다.
	private String makeSql(String ...studentsIds) {
		boolean flg = false;
		
		String sqlStudent = "SELECT * FROM student_table";
		// append되는 경우 StringBuffer 클래스를 사용. 일반 string을 +하면 뒤에 추가되는게 아니라 새로운 String객체가 생성되는거임. -> Heap겁나 잡아먹음.
		for (String str : studentsIds) {
        	if (str.equals("ALL")) {
        		sqlStudent = "SELECT * FROM student_table";
        		break;
        	}
        	if (flg == false) {
        		sqlStudent += " WHERE student_id='" + str + "'";
        		flg = true;
        	}
        	else {
        		sqlStudent += " OR student_id='" + str + "'";
        	}
        }
		return sqlStudent;
	}
	
	private void printTable(String subject, ResultSet rsStudentInfo) {
		// 아래의 변수들이 스튜던트나 서브젝트의 프로퍼티여야함.
		// 학생마다 하나의 인스턴스를 가지고 있어야한다.
		int studentId;
		int score;
		String name;
		String major;
		String commonCore;
		String sqlSubject = null;
		ResultSet 			rsSubject = null; // 잠깐 쓰는 객체(temp변수같다). 이 객체에서 값을 꺼내서 값을 다른 객체에 저장해야함. 이친구들을 끌고다니면 안된다. 
		PreparedStatement	pstmtSubject = null;
		
		try 
		{
			System.out.println("---------------------------------------\n"
					+ "\t     " + subject + " 수강생 학점\n"
					+ "\t     " + "============\n"
					+ "이름\t| \t학번\t| 중점과목\t| 점수");
			while (rsStudentInfo.next()) {	// ResultSet의 다음 로우가 있는 동안 계속 데이터 조회
				studentId = rsStudentInfo.getInt("student_id");
				name = rsStudentInfo.getString("name");
				major = rsStudentInfo.getString("major");
				score = rsStudentInfo.getInt(subject);
				sqlSubject = "SELECT common_core FROM cc_table WHERE major='" + major + "'";
				pstmtSubject = conn.prepareStatement(sqlSubject);
				rsSubject = pstmtSubject.executeQuery();
				rsSubject.next();
				commonCore = rsSubject.getString("common_core");
				System.out.println(name + "\t| " + studentId + "\t| " + 
				commonCore + "\t| " + score + ":" + claculateGrade(score, subject, commonCore));
			}
			System.out.println("---------------------------------------\n");
		} catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                // 메모리 해제
                rsSubject.close();
                pstmtSubject.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
	    }
	}
}
