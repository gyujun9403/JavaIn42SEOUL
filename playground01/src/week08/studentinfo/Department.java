package week08.studentinfo;

public class Department {
	private String name;
	//객체로 만드는게 맞지만, 궅이 그럴 필요가 없으므...
	private String CommonCore;
	
	public Department(String name, String CommonCore) {
		this.name = name;
		this.CommonCore = CommonCore;
	}
	public String getName() {
		return name;
	}
	public String getCommonCore() {
		return CommonCore;
	}
}
