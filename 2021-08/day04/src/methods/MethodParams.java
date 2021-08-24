//tiny pro lab

package methods;

public class MethodParams {
	public static void main(String[] args) {
//	create class instance
		MethodParams mp = new MethodParams();
	
//	call convertIntToDouble method here
		double d = mp.convertIntToDouble (44);
		
		System.out.println(d);
		
//		call sum method here
		System.out.println(mp.sum(1.0, 2,3));
		}

//	create method here
	public double convertIntToDouble (int num) {
		return (double)num;
	}
	
//	new sum method
	public double sum(double num1, int num2, int num3) {
		return num1+num2+num3;
	}
}