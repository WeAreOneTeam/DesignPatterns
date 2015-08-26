package team.create.abs_factory;

public class BCarWheel extends CarWheel {

	public BCarWheel( String tType ) {
		this.type = tType;
	}

	@Override
	public String toString() {
		return "BCarWheel( type: " + type + " )";
	}

}
