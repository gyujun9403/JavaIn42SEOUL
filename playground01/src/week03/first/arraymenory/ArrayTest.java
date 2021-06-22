package week03.first.arraymenory;

public class ArrayTest {

	public static void main(String[] args) {
		boolean[] booleanArr = {true, true, false};
		char[] charArr = {'a', 'b', 'c'};
		short[] shortArr =  {1, 2, 3, 4, 5};
		int[] intArrFirst =  {1, 2, 3, 4, 5};
		int[] intArrSecond =  {1, 2, 3, 4, 5};
		int[] intArrThrid =  new int[] {1, 2, 3, 4, 5};
		float[] floatArr =  {1, 2, 3, 4, 5};
		double[] doubleArr =  {1, 2, 3, 4, 5};
		long[] longArr =  {1, 2, 3, 4, 5};
		String[] stringArrFirst = {"1", "2", "3"};
		String[] stringArrSecond = {"1", "2", "3"};
		String[] stringArrThird = new String[] {"1", "2", "3"};
		
		System.out.println("boolean	: " + booleanArr);
		//char의 배열의 경우, String으로 자동 변환된다.
		System.out.println("char	: " + charArr.toString());
		System.out.println("short	: " + shortArr);
		System.out.println("int 1	: " + intArrFirst);
		System.out.println("int 2	: " + intArrSecond);
		System.out.println("int 3	: " + intArrThrid);
		System.out.println("float	: " + floatArr);
		System.out.println("double	: " + doubleArr);
		System.out.println("long	: " + longArr);
		System.out.println("Stinrg 1: " + stringArrFirst);
		System.out.println("Stinrg 2: " + stringArrSecond);
		System.out.println("Stinrg 3: " + stringArrThird);
	}

}
