package team.create.abs_factory;

public class ACarFrame extends CarFrame {

	public ACarFrame( String tType ) {
		this.type = tType;
	}

	@Override
	public String toString() {
		return "ACarFrame( type: " + type + " )";
	}

}
