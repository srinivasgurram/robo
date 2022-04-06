package com.robo.model;

import com.robo.exception.InvalidMoveException;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Reprsents the robo entity
 * 
 * @author sgurram
 *
 */
@Data
@Slf4j
public class Robo {
	int width;
	int depth;
	int x;
	int y;
	char direction;
	StringBuffer succesfulMoves = new StringBuffer();

	public Robo(int width, int depth, int x, int y, char direction) {
		this.width = width;
		this.depth = depth;
		this.x = x;
		this.y = y;
		this.direction = Character.toUpperCase(direction);
	}

	/*
	 * This method helps robo to take the necessary moves either Left / Right /
	 * Forward. If that move is not valid then throws an exception
	 * 
	 */
	public void move(char step) {
		succesfulMoves.append(step);
		switch (step) {
		case 'L':
			this.changeDirection(step);
			break;
		case 'R':
			this.changeDirection(step);
			break;
		case 'F':
			this.forward();
			// when robo is taking forward step and either x or y coordinates becomes less
			// than zero then it is a invalid move
			if (x < 0 || y < 0 || x > depth || y > width)
				throw new InvalidMoveException("Invalid move at:" + succesfulMoves.toString());
			break;
		}

		log.debug(String.format("position after step: %c : %d %d %c", step, x, y, direction));
	}

	/*
	 * This method helps to changed the direction based on the current direction
	 */
	private void changeDirection(char step) {
		switch (direction) {
		case 'N':
			this.direction = (Character.compare(step, 'L') == 0) ? 'W' : 'E';
			break;
		case 'S':
			this.direction = (Character.compare(step, 'L') == 0) ? 'E' : 'W';
			break;
		case 'E':
			this.direction = (Character.compare(step, 'L') == 0) ? 'N' : 'S';
			break;
		case 'W':
			this.direction = (Character.compare(step, 'L') == 0) ? 'S' : 'N';
			break;

		}
	}

	/*
	 * This method helps to take the forward step based on the current direction
	 */
	private void forward() {
		switch (direction) {
		case 'N':
			// if robo is facing north and taking forward step then decrease the
			// y-coordinate
			y--;
			break;
		case 'S':
			// if robo is facing south and taking forward step then increase the
			// y-coordinate
			y++;
			break;
		case 'E':
			// if robo is facing east and taking forward step then decrease the x-coordinate
			x--;
			break;
		case 'W':
			// if robo is facing west and taking forward step then increase the x-coordinate
			x++;
			break;
		}
	}

}
