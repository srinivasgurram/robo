package com.robo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.robo.exception.InvalidMoveException;
import com.robo.model.Robo;
import com.robo.request.RoboMoveRequest;

@SpringBootTest
public class RoboServiceTest {

	@Autowired
	IRoboService roboService;

	@Test
	void testFindFinalPosition() {
		RoboMoveRequest request = new RoboMoveRequest(5, 5, 1, 2, "N", "RFRFFRFRF");
		Robo robo = roboService.findFinalPosition(request);
		assertEquals(1, robo.getX());
		assertEquals(3, robo.getY());
		assertEquals('N', robo.getDirection());

	}

	@Test
	void testInvalidMove() {
		RoboMoveRequest request = new RoboMoveRequest(5, 5, 0, 0, "E", "RFLFFLRF");
		Exception exception = assertThrows(InvalidMoveException.class, () -> roboService.findFinalPosition(request));
	}

}
