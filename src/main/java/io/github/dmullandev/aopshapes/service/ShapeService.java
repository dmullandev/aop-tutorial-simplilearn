package io.github.dmullandev.aopshapes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.dmullandev.aopshapes.components.Circle;
import io.github.dmullandev.aopshapes.components.Triangle;

/**
 * ShapeService class set as a component to be recognised as a custom bean in
 * the Spring container.
 * 
 * @author dmullandev
 *
 */

@Service
public class ShapeService {

	@Autowired
	private Circle circle;
	@Autowired
	private Triangle triangle;

	public Circle getCircle() {
		System.out.println("Inside getCircle method");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
