package com.rahmadnet.statepattern;

import java.util.Scanner;


public class TestATMMachine 
{
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ATMMachine atmMachine =  new ATMMachine();
		
		System.out.println("============ATM==============\n");
		atmMachine.insertCard();
		int pin = scan.nextInt();
		atmMachine.insertPin(pin);
		int money = scan.nextInt();
		atmMachine.requestChas(money);
		System.out.println("\nWELCOME");
	
		
	}

}
