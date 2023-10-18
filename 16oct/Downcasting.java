class Animal {
    void print(){
        System.out.println("Animal Class");
    }
}

class Dog extends Animal {
    void print(){
        System.out.println("Dog Class");
    }
}

public class Downcasting{
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog)a;
		d.print();
	}
}