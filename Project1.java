// Converts user's number inputs into valid dates including variables

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		// Declaring Variables
		int monthInput;
		String month = "Month";
		int dayInput;
		int yearInput;
		boolean loop = false;
		
		do {
			// Enter date numbers to see their date
			System.out.print("Enter 3 valid date number: ");
	
			// Assigning Input to Variables
			monthInput = keyboard.nextInt();
			dayInput = keyboard.nextInt();
			yearInput = keyboard.nextInt();
			
			// Fixing User's Input in case of invalid months/days/years
			while (monthInput < 1 || monthInput > 12) {
				System.out.print("Please enter a corret month number: ");
				monthInput = keyboard.nextInt();
			}
			while (dayInput < 1 || dayInput > 31) {
				System.out.print("Please enter a corret day number: ");
				dayInput = keyboard.nextInt();
			}
			while (monthInput < 1 || monthInput > 99) {
				System.out.print("Please enter a corret year number: ");
				yearInput = keyboard.nextInt();
			}
			// Assigning year to 21st Century
			int year = 2000 + yearInput;
			
			// Assigning Months with instructions for special cases
				switch (monthInput) {
					case 1:
						month = "January";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 2:
						// Finding if year is leap year by dividing by 4 without remainder
						month = "February";
						if (year % 4 == 0) {
							while (dayInput > 29) {
								System.out.print("Please enter a corret day number: ");
								dayInput = keyboard.nextInt(); }
						}
						else while (dayInput > 28) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 3:
						month = "March";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 4:
						month = "April";
						while (dayInput > 30) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 5:
						month = "May";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 6:
						month = "June";
						while (dayInput > 30) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 7:
						month = "July";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 8:
						month = "August";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 9:
						month = "September";
						while (dayInput > 30) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 10:
						month = "October";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 11:
						month = "November";
						while (dayInput > 30) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					case 12:
						month = "December";
						while (dayInput > 31) {
							System.out.print("Please enter a corret day number: ");
							dayInput = keyboard.nextInt(); }
						break;
					default:
						System.out.print("Please enter a correct year number: ");
						yearInput = keyboard.nextInt();
					}
				
				// Print Final Date in Correct Format
				System.out.println(month + " " + dayInput + ", " + year); 
			
				// Loop Continuation Conditions
				System.out.print("Do you want to try another date? (Y/N) ");
				String cont = keyboard.next();
				System.out.println();
				if (cont == "Y" || cont == "y") {
					loop = true; } 
		}
		while (loop = true);
				
	}		
			
	}

