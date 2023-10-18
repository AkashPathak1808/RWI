interface Person{
	void walk();
	void see();
}

class Men implements Person {
	@Override
	public void walk() {
		System.out.println("Men is walking");
	}
	
	@Override
	public void see() {
		System.out.println("Men is seeing");
	}
}

public class Interface {
	public static void main(String[] args) {
		Men t = new Men();
		t.walk();
		t.see();
	}
}