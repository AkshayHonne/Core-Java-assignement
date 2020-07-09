package com.corejava.assignement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubs

		Threadname t1 = new Threadname();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		t1.start();
		t1.join();
		t1.setName("MyThread");
		System.out.println("Thread name after changing....");
		System.out.println("New Thread name:  " + t1.getName());

		System.out.println("Current time: " + sdf.format(cal.getTime()));

		Thread.sleep(10000);

		System.out.println("Displyaing the current time again after 10 sec sleep: " + sdf.format(cal.getTime()));

	}

}
