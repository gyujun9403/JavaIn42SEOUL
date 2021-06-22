package week03.first.arraycopy;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int i = 0;
		String[] StringArrOld = {"ab", "c", "def", "gh"};
		String[] StringArrNew = new String[5];
		
		//System.arraycopy(Old, OldStartIndex, New, NewStartIndex, length);
		//아래는 StringArrOld 1번 인덱스부터 2개를 charArrNew 3번 인텍스부터 복붙.
		System.arraycopy(StringArrOld, 1, StringArrNew, 3, 2);
		//향상된 for문.
		for (String newElement : StringArrNew)
			System.out.println(i++ + " : " + newElement);
	}

}
