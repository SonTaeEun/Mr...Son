package testInterFace;

public class MainClass {
	public static void main(String[] args) {
		Toy Robot = new ToyRobot();
		Toy Airplane = new ToyAirplane();
		
		System.out.println();
		
		Toy toys[] = {Robot, Airplane};
		
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();			
			toys[i].run();		
			toys[i].alarm();			
			toys[i].light();
			
			System.out.println("puhaha");
		}
	}
}
