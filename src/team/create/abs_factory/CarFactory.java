package team.create.abs_factory;

abstract public class CarFactory {
	
	abstract public CarFrame createCarFrame( String type );
	
	abstract public CarWheel createCarWheel( String type );

}
