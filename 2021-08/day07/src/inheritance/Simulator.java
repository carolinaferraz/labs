package inheritance;

public class Simulator {
	
	public static void main(String[] args) {
		ActionFigure hellboy = new ActionFigure();
		hellboy.setName("hellboy name");
//		System.out.println(hellboy.getName());
		
		
		Dog dog = new Dalmatian();
		
		dog.bark();
		((Dalmatian)dog).play();
		
	
	}

}
