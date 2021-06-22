package week03.first.twodimentionarray;

public class TwoDimentionArrayTest {

	public static void main(String[] args) {
		int[][] intArr;
		
		intArr = new int[2][];
		intArr[0] = new int[] {1, 2, 3};
		intArr[1] = new int[10];
		
		System.out.println(intArr);
		System.out.println(intArr.length);
		System.out.println();
		System.out.println(intArr[0]);
		System.out.println(intArr[0].length);
		System.out.println();
		System.out.println(intArr[1]);
		System.out.println(intArr[1].length);
	}

}
