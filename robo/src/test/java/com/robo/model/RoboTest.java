package com.robo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.robo.exception.InvalidMoveException;

@SpringBootTest
public class RoboTest {

	@Test
	void testDirectionFromEtoL() {
		Robo robo = new Robo(6, 5, 3, 4, 'E');
		robo.move('L');
		assertEquals('N', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('N', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(3, robo.getY());
	}

	@Test
	void testDirectionFromEtoR() {
		Robo robo = new Robo(6, 5, 3, 4, 'E');
		robo.move('R');
		assertEquals('S', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('S', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(5, robo.getY());
	}

	@Test
	void testDirectionFromWtoL() {
		Robo robo = new Robo(6, 5, 3, 4, 'W');
		robo.move('L');
		assertEquals('S', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('S', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(5, robo.getY());
	}

	@Test
	void testDirectionFromWtoR() {
		Robo robo = new Robo(6, 5, 3, 4, 'W');
		robo.move('R');
		assertEquals('N', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('N', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(3, robo.getY());
	}
	
	@Test
	void testDirectionFromNtoL() {
		Robo robo = new Robo(6, 5, 3, 4, 'N');
		robo.move('L');
		assertEquals('W', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('W', robo.getDirection());
		assertEquals(4, robo.getX());
		assertEquals(4, robo.getY());
	}
	
	@Test
	void testDirectionFromNtoR() {
		Robo robo = new Robo(6, 5, 3, 4, 'N');
		robo.move('R');
		assertEquals('E', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('E', robo.getDirection());
		assertEquals(2, robo.getX());
		assertEquals(4, robo.getY());
	}
	
	@Test
	void testDirectionFromStoL() {
		Robo robo = new Robo(6, 5, 3, 4, 'S');
		robo.move('L');
		assertEquals('E', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('E', robo.getDirection());
		assertEquals(2, robo.getX());
		assertEquals(4, robo.getY());
	}
	
	@Test
	void testDirectionFromStoR() {
		Robo robo = new Robo(6, 5, 3, 4, 'S');
		robo.move('R');
		assertEquals('W', robo.getDirection());
		assertEquals(3, robo.getX());
		assertEquals(4, robo.getY());
		robo.move('F');
		assertEquals('W', robo.getDirection());
		assertEquals(4, robo.getX());
		assertEquals(4, robo.getY());
	}
	
	@Test
	void testInvalidMove() {
		Robo robo = new Robo(5, 4, 4, 4, 'W');
		Exception exception = assertThrows(InvalidMoveException.class, () -> robo.move('F'));
	}
}
