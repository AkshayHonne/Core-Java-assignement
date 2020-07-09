package com.java.assignement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal D = new dog("Bark");
		animal H = new horse("Neigh");
		animal C = new cat("Meow");
		System.out.println("How does Dog shout ?");
		D.sound();
		
		System.out.println("How does Horse shout ?");
		H.sound();
		
		System.out.println("How does Cat shout ?");
		C.sound();
		
	}

}
