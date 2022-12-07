package com.bilgeadam.week04.lesson1.solid.Dependencyinversion;

public class DebitCard implements IPaymentMethod  {
	public void doTransaction(int amount)
	{
		System.out.println("tx done with debit transection");
	}

	@Override
	public void doTranssaction() {
		// TODO Auto-generated method stub
		
	}

}
