package week02.first.accessmodifier;

public class AccessModifierMain {

	public static void main(String[] args) {
		AccessModifier amm = new AccessModifier();
		System.out.println(">> amm.ft1 : " + amm.ft1);
		/* System.out.println(">> amm.ft2 : " + amm.ft2);
		** -> 'The field AccessModifier.ft2 is not visible' error occur
		*/
		System.out.println(">> amm.ft2 : " + amm.getFt2());
	}

}
