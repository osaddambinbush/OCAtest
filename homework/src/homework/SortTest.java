package homework;

public class SortTest {

	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		int c = 2;

		if (a < b && b < c) {
			System.out.println("Plan A");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}  else if (a > b && b > c) {
			System.out.println("Plan B");
			System.out.println("a = " + c);
			System.out.println("b = " + b);
			System.out.println("c = " + a);

		} else if (c < a & c < b & a < b) {
			System.out.println("Plan C");
			System.out.println("a = " + c);
			System.out.println("b = " + a);
			System.out.println("c = " + b);

		} else if (a < b && b > c) {
			System.out.println("Plan D");
			System.out.println("a = " + a);
			System.out.println("b = " + c);
			System.out.println("c = " + b);
			

		}else if (a > b && b < c) {
			System.out.println("Plan E");
			System.out.println("a = " + b);
			System.out.println("b = " + a);
			System.out.println("c = " + c);

		}

	}

}
