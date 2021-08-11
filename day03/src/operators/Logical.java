package operators;

public class Logical {
	public static void main(String[] args) {
//		AND &
//		System.out.println(true & true);
//		System.out.println(true & false);
		
//		OR  | 
//		System.out.println(false | true);
//		System.out.println(false | false);
		
		System.out.println(printTheReturnTrue() & printTheReturnFalse());
		System.out.println();
		System.out.println(printTheReturnTrue() && printTheReturnFalse());
		System.out.println();
		System.out.println(printTheReturnFalse() | printTheReturnTrue());
	}
	
	public static boolean printTheReturnTrue() {
		System.out.println("this returns true");
		return true;
	}
	
	public static boolean printTheReturnFalse() {
		System.out.println("this returns false");
		return false;
	}
}
