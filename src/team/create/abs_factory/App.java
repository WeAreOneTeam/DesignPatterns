package team.create.abs_factory;

public class App {
	
	public static void main( String[] args )
	{
		CarFactory carFac = new ACarFactory();
		CarFrame frame = carFac.createCarFrame( "type 11" );
		CarWheel wheel = carFac.createCarWheel( "type 12" );
		System.out.println( "What from ACarFactory: " );
		System.out.println( "\t" + frame.toString() );
		System.out.println( "\t" + wheel.toString() );

		carFac = new BCarFactory();
		frame = carFac.createCarFrame( "type 21" );
		wheel = carFac.createCarWheel( "type 22" );
		System.out.println( "What from BCarFactory: " );
		System.out.println( "\t" + frame.toString() );
		System.out.println( "\t" + wheel.toString() );
	}

}
