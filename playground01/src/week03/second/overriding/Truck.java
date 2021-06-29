package week03.second.overriding;

public class Truck extends Car{
	
	@Override
	public void getLoadageWeight(int loadageWeight) {
		if (loadageWeight > 1000) {
			System.out.println("Too heavy!!!");
		}
		else {
			this.loadageWeight = loadageWeight;
			System.out.println(">> set loadage : " + loadageWeight);
		}
	}
}
