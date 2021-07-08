package week05.second.intefaceengine;

public abstract class Car{
	private CarEngine engine;
	private CarTire tire;
	protected int passenger;
	
	public Car(CarEngine engine, CarTire tire) {
		this.engine = engine;
		this.tire = tire;
	}
	
	protected void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public abstract void checkPassenger(int passenger);
	
	public final void ChangeTire(CarTire newTire) {
		tire = newTire;
	}
	
	public final void moveTo(int times) {
		System.out.println("--------------------------");
		engine.Start();
		for(int i = 0; i < times; i++) {
			engine.run();
			tire.roll();
		}
		engine.stop();
		System.out.println("##########################\n");
	}
}
