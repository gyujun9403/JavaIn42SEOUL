package week02.first.string;

public class StringMain {

	public static void main(String[] args) {
		String arr1 = "aaaaa";
		String arr2 = "aaaaa";
		String arr3 = "bbbbb";
		String arr4 = new String("bbbbb");
		
		System.out.println("-----------[comparing only string]-----------");
		System.out.print(">> arr1 and arr2 hava ");
		if (arr1.equals(arr2))
			System.out.println("same string.");
		else
			System.out.println("different string.");
		System.out.print(">> arr3 and arr4 have "); 
		if (arr3.equals(arr4))
			System.out.println("same string.");
		else
			System.out.println("different string.");
		System.out.println("\n---------[comparing reference value]---------");
		System.out.print(">> arr1 and arr2 are located ");
		if (arr1 == arr2)
			System.out.println("same Heap memory.");
		else
			System.out.println("different Heap memory.");
		System.out.print(">> arr3 and arr4 are located "); 
		if (arr3 == arr4)
			System.out.println("same Heap memory.");
		else
			System.out.println("different Heap memory.");
		
	}

}
