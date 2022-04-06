package com.robo.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Robo movement request 
 * 
 * @author sgurram
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class RoboMoveRequest {
	
	@Min(value = 0, message = "The value must be positive")
	private int width;
	@Min(value = 0, message = "The value must be positive")
	private int depth;
	@Min(value = 0, message = "The value must be positive")
	private int positionX;
	@Min(value = 0, message = "The value must be positive")
	private int positionY;
	@Pattern(regexp = "^[N|E|W|S]{1}$", message ="Must be N or E or W or S")
	private String direction;
	@NotEmpty
	private String navigationCommand;
}
