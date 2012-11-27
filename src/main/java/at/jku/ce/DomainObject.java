package main.java.at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}

	public DomainObject(String uuid) {
		super();
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}
}
