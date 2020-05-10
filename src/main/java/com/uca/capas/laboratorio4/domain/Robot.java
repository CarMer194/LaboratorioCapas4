package com.uca.capas.laboratorio4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="No puedes agregar un producto porque eres robot")
	private Boolean soyRobot;
	
	
	
	public Robot() {
		super();
	}

	public Robot(Boolean soyRobot) {
		super();
		this.soyRobot = soyRobot;
	}

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}
