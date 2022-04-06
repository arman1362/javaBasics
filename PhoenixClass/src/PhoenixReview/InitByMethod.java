package PhoenixReview;

public class InitByMethod {

	int id;
	String name;

	void AddRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + name;
	}

}
