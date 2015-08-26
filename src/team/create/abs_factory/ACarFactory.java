package team.create.abs_factory;

public class ACarFactory extends CarFactory {

	@Override
	public CarFrame createCarFrame(String type) {
		return new ACarFrame( type );
	}

	@Override
	public CarWheel createCarWheel(String type) {
		return new ACarWheel( type );
	}

}
