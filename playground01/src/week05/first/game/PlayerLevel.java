package week05.first.game;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public final void go(int times) {
		showLevelMessage();
		run();
		for (int i = 0; i < times; i++) {
			jump();
		}
		turn();
	}
}
