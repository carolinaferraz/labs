package flowcontrol;

public class ConditionalStatements {

	public static void main(String[] args) {
		int precipitation = 0;
		int waterOutput = 0;
		
//		start if-sttmt
		if (precipitation < 20) {
			waterOutput = 30;
		} else if (precipitation < 31) {
			waterOutput =10;
		} else if (precipitation < 56) {
			waterOutput = 0;
		} else {
			waterOutput = 0;
		}

		System.out.println("the water output should be " + waterOutput);
	}

}
