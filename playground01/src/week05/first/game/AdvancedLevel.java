package week05.first.game;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 앞으로 이동합니다.");
	}

	@Override
	public void jump() {
		System.out.println("한 번 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("돌 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("####Advanced####");
	}
	
}
