package com.test;

import java.util.Scanner;

public class TicketBookingDemo {

	public static void main(String[] args) {
		System.out.println("***************Welcome to Ticket Booking System**********");
		System.out.println("1. New Booking");
		System.out.println("2. Edit Booking");
		System.out.println("3. Cancel Booking");
		System.out.println("4. Search Booking");
		System.out.println("Choose any option from above:");
		
		Scanner sc=new Scanner(System.in);//ctrl+shift+o (auto import)
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("******New Booking Details***");
				System.out.println("Enter your name:");
				break;
			case 2:
				System.out.println("******Edit Booking Details***");
				System.out.println("Enter your booking id:");
				int id = sc.nextInt();
				System.out.println("you have entered booking id: "+id);
				break;
			case 3:
				System.out.println("******Cancel Booking Details***");
				System.out.println("Enter your booking id:");
				break;
			case 4:
				System.out.println("******Search Booking Details***");
				System.out.println("Do you have booking id?");
				break;
			default:
				System.out.println("Please enter valid option...");
				break;
		}
		
	}

}
