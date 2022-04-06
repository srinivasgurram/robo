package com.robo.service;

import com.robo.model.Robo;
import com.robo.request.RoboMoveRequest;
/**
 * Interface for roboservice
 * 
 * @author sgurram
 *
 */
public interface IRoboService {
	public Robo findFinalPosition(RoboMoveRequest request);
}
