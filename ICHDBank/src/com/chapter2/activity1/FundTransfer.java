package com.chapter2.activity1;

public class FundTransfer 
{

	private double amount;
	public FundTransfer()
	{
		
	}
	public FundTransfer(double amount)
	{
		this.amount=amount;
	}
   public double getAmount()
   {
	   return amount;
   }
   public void setAmount(double amount)
   {
	   this.amount=amount;
   }
}
