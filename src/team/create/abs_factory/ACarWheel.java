package team.create.abs_factory;

public class ACarWheel extends CarWheel {

	public ACarWheel( String tType ) {
		this.type = tType;
	}

	@Override
	public String toString() {
		return "ACarWheel( type: " + type + " )";
	}

}
