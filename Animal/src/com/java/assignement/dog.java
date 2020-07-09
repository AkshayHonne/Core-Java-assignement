package com.java.assignement;

public class dog extends animal {
	private String sound;

	public dog(String sound) {
		this.sound = sound;
	}

	public void sound()
	{
		System.out.println("Dog is making a sound like " +sound);
		
	}

}
