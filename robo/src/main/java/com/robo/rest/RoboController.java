package com.robo.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robo.model.Robo;
import com.robo.request.RoboMoveRequest;
import com.robo.service.IRoboService;

/**
 * Api interface class Robo
 * 
 * @author sgurram
 *
 */
@RestController
@RequestMapping("/robo")
@Validated
public class RoboController {
	
	@Autowired
	IRoboService roboService;
	
	@PostMapping("/findFinalPosition")
	public Robo moveTo(@RequestBody @Valid RoboMoveRequest request) {
		return roboService.findFinalPosition(request);
	}
	
}
