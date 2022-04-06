package com.robo.service.impl;

import org.springframework.stereotype.Service;

import com.robo.model.Robo;
import com.robo.request.RoboMoveRequest;
import com.robo.service.IRoboService;

import lombok.extern.slf4j.Slf4j;
/**
 * Implemenation class for RoboService
 * 
 * @author sgurram
 *
 */
@Slf4j
@Service
public class RoboService implements IRoboService{

	public Robo findFinalPosition(RoboMoveRequest request) {
		log.debug("RobotService.findFinalPosition() - Start");
		Robo robo = new Robo(request.getWidth()-1, request.getDepth()-1, request.getPositionX(), request.getPositionY(), request.getDirection().charAt(0));
		for (char ch : request.getNavigationCommand().toUpperCase().toCharArray()) {
			robo.move(ch);
		}
		log.info(String.format("\n Size of the room: %d %d \n Position of the robo: %d %d %s \n Navigation command: %s \n Reported to position: %d %d %c",
				robo.getWidth(), robo.getDepth(), request.getPositionX(), request.getPositionY(), request.getDirection(), request.getNavigationCommand(), robo.getX(), robo.getY(), robo.getDirection()));
		log.debug("RobotService.findFinalPosition() - End");
		return robo;
	}

}
