package com.robo;

import java.io.IOException;
import java.util.Scanner;

import com.robo.request.RoboMoveRequest;
import com.robo.service.IRoboService;
import com.robo.service.impl.RoboService;

/**
 * Main class to execute the robo app
 * 
 * @author sgurram
 *
 */
public class RoboCLI {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the room:");
		System.out.println("Width: ");
		int width = sc.nextInt();
		System.out.println("Depth: ");
		int depth = sc.nextInt();
		
		System.out.println("Please enter the starting position and direction of the robot:");
		System.out.println("X-coordinate: ");
		int x = sc.nextInt();
		System.out.println("Y-coordinate: ");
		int y = sc.nextInt();
		System.out.println("Direction(N/E/W/S): ");
		char direction = (char) System.in.read();
		
		System.out.println("Please enter the navigation command using L/R/F ");
		String navigation = sc.next();
		sc.close();
		
		/*
		 * RoboMoveRequest request = new RoboMoveRequest(width, depth, x, y, new
		 * String(direction), navigation); IRoboService roboService = new RoboService();
		 * roboService.findFinalPosition(request);
		 */
		
	}

}
