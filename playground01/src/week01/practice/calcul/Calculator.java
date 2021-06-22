package week01.practice.calcul;

public class Calculator {
	public int number1;
	public int number2;
	public int add() {return (number1 + number2);};
	public int substract() {return (number1 - number2);};
	public int times() {return (number1 * number2);};
	public int divide() {
		if (number2 != 0)
			return (number1 / number2);
		return (0);
	}
}
