package week05.first.game;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빠르게 앞으로 이동합니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 멀리 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("####Super####");
	}
	
}
