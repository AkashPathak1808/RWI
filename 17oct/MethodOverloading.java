class CalculateSquare {
	public void square() {
		System.out.println("No Parameter Method Called");
	}

	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}

	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
}

public class MethodOverloading{
	public static void main(String[] args) {
		CalculateSquare cal = new CalculateSquare();
		cal.square();
		cal.square(5);
		cal.square(2.5f);
	}
}