 package com.practies2;

public class SwitchWeekDays {
	public void dispalyDays() {
		String day = "Tuesday";
		switch (day) {
		case "Monday":
			System.out.println("today is " + day);
			break;
		case "Tuesday":
			System.out.println("today is " + day);
			break;

		case "Wednesday":
			System.out.println("today is " + day);
			break;

		case "Thusday":
			System.out.println("today is " + day);
			break;

		case "Friday":
			System.out.println("today is " + day);
			break;

		case "Satday":
			System.out.println("today is " + day);
			break;

		case "Sunday":
			System.out.println("today is " + day);

		}
	}

	public static void main(String[] args) {
		SwitchWeekDays SWD = new SwitchWeekDays();
		SWD.dispalyDays();
	}

}
