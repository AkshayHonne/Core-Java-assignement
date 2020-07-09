package com.java.assignement;

public class horse extends animal {

	private String sound;
	
	public horse(String sound) {
		super();
		this.sound = sound;
	}

	public void sound()
	{
		System.out.println("Horse is making a sound like " +sound);
		
	}
}
