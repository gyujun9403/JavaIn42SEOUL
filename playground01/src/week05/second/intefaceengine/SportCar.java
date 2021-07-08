package week05.second.intefaceengine;

public class SportCar extends Car{
	SportCar(CarEngine engine, CarTire tire) {
		super(engine, tire);
	}

	@Override
	public void checkPassenger(int passenger) {
		if (passenger > 2)
			System.out.println("스포츠카에 승객은 최대 2명까지 탑승 가능합니다.");
		else
			setPassenger(passenger);
	}
	
}
