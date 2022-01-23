import java.util.HashMap;

public class City {
	HashMap<String, Integer> destinations;
	private String name;

	public City(String name) {
		this.name = name;
	}

	public void addDestination(String destination, int length) throws AlreadyAddedError {
		if (destinations.containsKey(destination)) {
			throw new AlreadyAddedError();
		}
		destinations.put(destination, length);
	}

	public String getName() {
		return name;
	}
}
