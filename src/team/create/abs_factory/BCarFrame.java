package team.create.abs_factory;

public class BCarFrame extends CarFrame {

	public BCarFrame( String tType ) {
		this.type = tType;
	}

	@Override
	public String toString() {
		return "BCarFrame( type: " + type + " )";
	}

}
