package week01.practice.calcul;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.number1 = 10;
		calculator.number2 = 2;
		
		System.out.println(calculator.add());
		System.out.println(calculator.substract());
		System.out.println(calculator.times());
		System.out.println(calculator.divide());
	}

}
