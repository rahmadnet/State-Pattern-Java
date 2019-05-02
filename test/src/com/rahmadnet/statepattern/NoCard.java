package com.rahmadnet.statepattern;

public class NoCard implements ATMState {
 
	ATMMachine atmMachine;
	public NoCard(ATMMachine newatmMachine) 
	{
		atmMachine = newatmMachine;
	}

	@Override
	public void insertCard() 
	{
		System.out.print("Please Entered a PIN\n> ");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() 
	{
		System.out.println("Enter a Card first");
	}

	@Override
	public void insertPin(int pinEntered) 
	{
		System.out.println("Enter a card first");
	}

	@Override
	public void requestCash(int cashToWithdraw) 
	{
		System.out.println("Enter a card first");
	}

}
