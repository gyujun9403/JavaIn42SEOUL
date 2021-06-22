package week02.first.exer.userinfo;

public class UserInfoMain {

	public static void main(String[] args) {
		//UserInfo userInfo = new UserInfo();
		//new는 이니셜 라이즈가 이미 되어있다.
		//System.out.print(userInfo.getUserId());
		//System.out.println(userInfo.getUserName());
		// >> 0null
		UserInfo userGyeon = new UserInfo(123, "gyeon");
		System.out.println(userGyeon.getUserId());
		System.out.println(userGyeon.getUserName());
		System.out.println(userGyeon);
	}

}
