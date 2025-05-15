package lab9;

public class Calculator {

		public double add(double num1, double num2) {
			double add = num1 + num2;
			return add;
		}
		
		public double subtract(double num1, double num2) {
			double subtract = num1 - num2;
			return subtract;
		}
		
		public double multiply(double num1, double num2) {
			double multiply = num1 * num2;
			return multiply;
		}
		
		public double divide(double num1, double num2) {
			if(num2 == 0) {
				return 0;
			}
			double divide = num1 / num2;
			return divide;
		}
}
