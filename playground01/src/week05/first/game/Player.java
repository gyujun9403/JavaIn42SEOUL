package week05.first.game;

public class Player {
	PlayerLevel level;
	Player() {
		level = new BeginnerLevel();
	}
	
	public void play(int times) {
		level.go(times);
	}
	
	public void upgradeLevel(PlayerLevel newLevel) {
		level = newLevel;
	}
}
