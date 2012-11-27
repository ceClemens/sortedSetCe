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
		objectSet.add(DomainFactory.createDomainObject("Helga", "Logausgabe 1"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Logausgabe 2"));
		objectSet.add(DomainFactory.createDomainObject("Hans", "Logausgabe 3"));
		objectSet.add(DomainFactory.createDomainObject("Paul", "Logausgabe 4"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Logausgabe 5"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
		}
	}

}
