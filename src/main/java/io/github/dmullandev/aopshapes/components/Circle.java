package io.github.dmullandev.aopshapes.components;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

/**
 * Circle class set as a component to be recognised as a custom bean in the
 * Spring container.
 * 
 * @author dmullandev
 *
 */
@Component
public class Circle {
	private static Logger LOG = Logger.getLogger(Circle.class.getName());
	private String name = "John";


	public String getName() {
		LOG.info("Inside getName of circle ");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
