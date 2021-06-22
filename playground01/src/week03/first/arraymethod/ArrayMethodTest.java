package week03.first.arraymethod;

public class ArrayMethodTest {

	public static void main(String[] args) {
		String[] stringArrFirst = {"1", "234", "56"};
		String[] stringArrSecond = {"1", "234", "56"};
		
		System.out.println("stringArrFirst.length");
		System.out.println(">> " + stringArrFirst.length);
		//아래의 equal은 배열 인스턴스의 메소드이. 두 배열이 같은 것인지 비교하는 함수이다.
		//즉, 아래의 코드 stringArrFirst == stringArrSecond와 같다.
		System.out.println("stringArrFirst.equals(stringArrSecond)");
		System.out.println(">> " + stringArrFirst.equals(stringArrSecond));
		//아래의 equal은 String의 매서드인 equal이다.
		//즉, String의 내용물(문자)이 같은이 비교한다.
		System.out.println("stringArrFirst[1].equals(stringArrSecond[1])");
		System.out.println(">> " + stringArrFirst[1].equals(stringArrSecond[1]));
	}

}
