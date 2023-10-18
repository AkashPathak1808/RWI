interface Animal1 {
	void makeNoice();
}

class Dog1 implements Animal1 {
	@Override
	public void makeNoice() {
		System.out.println("Bark...");
	}
}

class Cat1 implements Animal1 {
	@Override
	public void makeNoice() {
		System.out.println("Meow...");
	}
}

public class InterfaceProblem {
	public static void getNoice(Animal1 an) {
		an.makeNoice();
	}
	
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		
		Cat1 c = new Cat1();
		
		getNoice(d);
		getNoice(c);
	}
}