package week05.second.intefaceengine;

public class HyundaiEngine implements CarEngine {
	@Override
	public void Start() {
		System.out.println("Hyundai의 엔진을 켭니다.");
	}
	
	@Override
	public void run() {
		System.out.println("Hyundai의 엔진이 돌아갑니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("Hyundai의 엔진을 끕니다.");
	}
}
