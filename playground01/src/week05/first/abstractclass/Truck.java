package week05.first.abstractclass;

public class Truck extends Car{

	public Truck(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setLoadage(int loadageWeight) {
		// TODO Auto-generated method stub
		if (loadageWeight > 15000)
			System.out.println("과적재 입니다.");
		else
			super.setLoadage(loadageWeight);
	}
	
}
