package com.rahmadnet.statepattern;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newatmMachine)
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
		System.out.println("\nCard Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered)
	{
		if(pinEntered == 1234)
		{
			System.out.println("\nEnter the Amount\ndeep withdrawal\nmultiple Rp. 100.000"
					+ "\nmaximum of 1 withdrawal"
					+ "\n\n Rp. 2.500.000\n");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else
		{
			System.out.println("\nWrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("\nCard Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) 
	{
		System.out.println("Enter PIN first");
	}

}
