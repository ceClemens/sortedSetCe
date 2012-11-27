package main.java.at.jku.ce;

import java.util.HashSet;
import java.util.Set;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(new DomainObject("Helga", "Logausgabe 1"));
		objectSet.add(new DomainObject("Walter", "Logausgabe 2"));
		objectSet.add(new DomainObject("Hans", "Logausgabe 3"));
		objectSet.add(new DomainObject("Paul", "Logausgabe 4"));
		objectSet.add(new DomainObject("Claudia", "Logausgabe 5"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.id);
		}
	}

}
