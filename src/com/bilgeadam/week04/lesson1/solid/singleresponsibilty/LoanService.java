package com.bilgeadam.week04.lesson1.solid.singleresponsibilty;

public class LoanService {
	public double getLoanIntereset(String loantype)
	{
		if (loantype.equals("homeloan"))
		{
			return 2.30;
		}
		if (loantype.equals("carloan"))
		{
			return 1.99;
		}
		if (loantype.equals("personelloan"))
		{
			return 2.00;
		}
		return 0;
		
		
	}

}
