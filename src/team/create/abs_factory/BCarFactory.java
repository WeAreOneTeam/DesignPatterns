package team.create.abs_factory;

public class BCarFactory extends CarFactory {

	@Override
	public CarFrame createCarFrame(String type) {
		return new BCarFrame( type );
	}

	@Override
	public CarWheel createCarWheel(String type) {
		return new BCarWheel( type );
	}

}
