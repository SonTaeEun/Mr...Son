package testInterFace;

public class ToyRobot implements Toy {
	
	public ToyRobot() {
		System.out.println(" ----- Robot Constructor ----- ");
	}

	@Override
	public void walk() {
		System.out.println(" ----- Robot Can walk ----- ");		
	}

	@Override
	public void run() {
		System.out.println(" ----- Robot Can run ----- ");
		
	}

	@Override
	public void alarm() {
		System.out.println(" ----- Robot has no alarm ----- ");
	}

	@Override
	public void light() {
		System.out.println(" ----- Robot has no light ----- ");
	}

}
