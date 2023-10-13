class Vehicle {
	public void gear() {
		System.out.println("There is gear in vehicle");
	}
}

class Car extends Vehicle {
	public void tyre() {
		System.out.println("There is 4 tyre in Car");
	}
	
	@Override
	public void gear() {
		super.gear();
		System.out.println("There is 6 gear in car");
	}
}

public class InheritanceTask{
	public static void main(String[] args) {
		Car c = new Car();
		c.tyre();
		c.gear();
	}
}
