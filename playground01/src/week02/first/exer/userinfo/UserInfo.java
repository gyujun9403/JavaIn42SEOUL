package week02.first.exer.userinfo;

public class UserInfo {
	private int userId;
	private String userName;

	
	// 생성자
	public UserInfo(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	// 참조값
	// information hiding
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
