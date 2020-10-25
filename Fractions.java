
public class Fractions {
	
	

	public static void addition(int num1, int den1, int num2, int den2) {
		int newDen = den1 * den2;
		num1 = num1 * den2;
		num2 = num2 * den1;
		int newNum = num1 + num2;
		
		System.out.println("Your result is " + newNum + " / " + newDen);
	}
      
		public static void subtraction(int num1, int den1, int num2, int den2) {
			int newDen = den1 * den2;
			num1 = num1 * den2;
			num2 = num2 * den1;
			int newNum = num1 - num2;
			
			System.out.println("Your result is " + newNum + " / " + newDen);
	}

		public static void multiplication(int num1, int den1, int num2, int den2) {
			int newNum = num1 * num2;
			int newDen = den1 * den2;		
			
			System.out.println("Your result is " + newNum + " / " + newDen);
	}
		
		public static void division(int num1, int den1, int num2, int den2) {
			int newNum = num1 * den2;
			int newDen = den1 * num2;		
			
			System.out.println("Your result is " + newNum + " / " + newDen);
	}
}
