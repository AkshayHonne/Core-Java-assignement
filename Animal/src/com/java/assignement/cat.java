package com.java.assignement;

public class cat extends animal {

	private String sound;

	public cat(String sound) {
		super();
		this.sound = sound;
	}


	public void sound()
	{
		System.out.println("Cat is making a sound like "+sound);
		
	}
	
}
