package testInterFace;

public class ToyAirplane implements Toy {
	
	public ToyAirplane() {
		System.out.println(" ----- AirPlane Constructor ----- ");
	}

	@Override
	public void walk() {
		System.out.println(" ----- Airplane Can not walk ----- ");		
	}

	@Override
	public void run() {
		System.out.println(" ----- Airplane Can not run ----- ");
		
	}

	@Override
	public void alarm() {
		System.out.println(" ----- Airplane has alarm ----- ");
		
	}

	@Override
	public void light() {
		System.out.println(" ----- Airplane has light ----- ");
		
	}

}
