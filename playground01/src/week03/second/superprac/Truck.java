package week03.second.superprac;

public class Truck extends Car{
	private String kind;
	Truck(String owner, String kind) {
		/* If super won't call first, 
		** "Constructor call must be the first statement in a constructor"
		** eccor occur.
		*/ 
		super(owner);
		this.kind = kind;
		System.out.println("Truck class called");
	}
}
