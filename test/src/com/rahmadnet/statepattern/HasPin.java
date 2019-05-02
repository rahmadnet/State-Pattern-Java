package com.rahmadnet.statepattern;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasPin(ATMMachine newatmMachine) 
	{
		atmMachine = newatmMachine;
	}
	

	@Override
	public void insertCard() 
	{
		System.out.println("You can't enter more than one card");
	}

	@Override
	public void ejectCard() 
	{
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) 
	{
		System.out.println("Already Entered PIN");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) 
	{
		if(atmMachine.cashInMachine >= 2500000)
		{
			System.out.println("\nwithdrawal exceeds the limit");
			System.out.println("\nCard Ejected");

		}else if(cashToWithdraw > atmMachine.cashInMachine)
		{
			System.out.println("Don't Have that Cash");
			System.out.println("\nCard Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}else
		{
			System.out.println(cashToWithdraw + " is provided by machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			System.out.println("the remaining balance " + atmMachine.cashInMachine);
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0)
			{
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}

}









