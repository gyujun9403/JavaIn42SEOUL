package week08.studentinfo.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import week08.studentinfo.Department;
import week08.studentinfo.GradeData;
import week08.studentinfo.StudentInfo;

public class OracleDAO implements DAO{
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "system";
	private static final String PASS = "oracle";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public OracleDAO() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<StudentInfo> getStudentInfoList() {
		String sql = "select * from student_table";
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				StudentInfo info = new StudentInfo(
						rs.getInt("student_id"), 
						rs.getString("name"), 
						rs.getString("major"));
				list.add(info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
            }
		}
		return list;
	}

	@Override
	public HashMap<String, Department> getDepartmentList() {
		String sql = "select * from commoncore_table";
		HashMap<String, Department> map = new HashMap<String, Department>();
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Department info = new Department(
						rs.getString("major"), 
						rs.getString("common_core"));
				map.put(info.getName(), info);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
            }
		}
		return map;
	}

	@Override
	public GradeData getKoreanGradeData() {
		String sql = "select * from korean_grade_table";
		GradeData info = new GradeData("Korean");
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				info.addScore(rs.getInt("student_id"), rs.getInt("grade"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
            }
		}
		return info;
	}
	

	@Override
	public GradeData getMathGradeData() {
		String sql = "select * from math_grade_table";
		GradeData info = new GradeData("Math");
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				info.addScore(rs.getInt("student_id"), rs.getInt("grade"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
            }
		}
		return info;
	}
	
}
