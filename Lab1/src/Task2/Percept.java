package Task2;

public class Percept {
	private String agentLocation;
	private Environment.LocationState state;
	public Percept(String agentLocation, Environment.LocationState locationState) {
		this.agentLocation = agentLocation;
		this.state = locationState;
	}

	public Environment.LocationState getLocationState() {
		return this.state;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}
}
