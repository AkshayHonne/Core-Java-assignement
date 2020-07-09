package com.corejava.assignement;

public class Threadname extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running.....");
		System.out.println("Current Thread Name= " + Thread.currentThread().getName());

	}
}
