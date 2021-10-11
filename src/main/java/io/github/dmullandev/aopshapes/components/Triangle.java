package io.github.dmullandev.aopshapes.components;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

/**
 * Triangle class set as a component to be recognised as a custom bean in the
 * Spring container.
 * 
 * @author dmullandev
 *
 */
@Component
public class Triangle {
	private static Logger LOG = Logger.getLogger(Triangle.class.getName());
	private String name = "triangle";

	public String getName() {
		LOG.info("Inside getName of triangle ");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
