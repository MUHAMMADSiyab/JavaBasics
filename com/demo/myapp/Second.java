package com.demo.myapp;

public class Second {
	public static void main(String[] args) {
		String msg; // declaration
		msg = "Hello"; // initialization

		String name = "John"; // Declaration

		char gender = 'M';

		System.out.print(gender);

		byte age =  12; // -128 -> 127

		short score = 340; // -32768 -> 32767

		int kilometers = 130000;

		long lightYears = 2132323232323l;

		float heightInMeters = 13.5f;

		double distanceInLightYears = 12.34576576;
		

		boolean isYoung = true;
		boolean graduated = false;

		String[] users = {"John", "Kim", "Brad", "Sam"};
		Object[] data = { 23, "Ahmed", true, 34.2f };

		String[] names = new String[6];

		names[0] = "Ijaz";
		names[5] = "Sara";

		System.out.println(names[5]);



		for(String user: users) {
			// System.out.println("The user is: " + user);
		}

		Car car = new Car(); // instance / object ..  instantiation
		String carDrivenMsg = car.drive();

		System.out.println(carDrivenMsg);
		

		// System.out.println(name);
		// System.out.println(users[4]);
	}
}


class Car {
	public String drive() {
		return "Drive the Car!";
	} 
}