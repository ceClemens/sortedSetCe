package main.java.at.jku.ce;

import java.util.UUID;

public class DomainObject {

	public String uuid= UUID.randomUUID().toString();
	private String name;

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}

	public DomainObject(String name, String comment) {
		super();
	}

	public String getUuid() {
		return uuid;
	}
}
