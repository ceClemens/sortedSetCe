package main.java.at.jku.ce;

import java.util.UUID;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
