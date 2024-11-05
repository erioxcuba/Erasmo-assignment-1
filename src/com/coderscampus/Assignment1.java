package com.coderscampus;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);		

        Double  initAmount = null;
        
        while (initAmount == null)
        	
        {
    		System.out.println("Enter the initial amount, greater than 0 and not greater than 1000000");
    		
            String initAmountInput = scanner.nextLine(); // Read a line of input
            
            initAmount = validateInitAmount (initAmountInput);
            
            if (initAmount == null)
            	
            {
        		System.out.println("your number doesnt comply with the requirements");
            }           
        }  

        Double  yearInterestRate = null;
        
        while (yearInterestRate == null)
        	
        {
    		System.out.println("Enter the year interest rate, greater than 0 and not greater than 1");
    		
            String yearInterestInput = scanner.nextLine(); // Read a line of input
            
            yearInterestRate = validateInterest (yearInterestInput);
            
            if (initAmount == null)
            	
            	{
        		System.out.println("your number doesnt comply with the requirements");
            	}           
        }  
        
        double compAmount = initAmount;
        
        for (var i =0; i< 6; i++)
        {
        	compAmount = calcCompoundingInterest (compAmount, yearInterestRate);
       		
            System.out.println("After " + (i + 1)*5 + " years, you would have: " + Math.round(compAmount));
        }
        
        scanner.close();

	}
	
	static double calcCompoundingInterest (double initAmount, double yearInterest)
	{
		double compAmount = initAmount;
		
		for (var i = 0; i < 5; i++)
		{
			compAmount *= (yearInterest + 1);
		}
		
		return compAmount;
	}
	
	static Double validateInitAmount (String initAmountInput )
	{
		Double initAmount= Double.parseDouble(initAmountInput);
		
	    return (initAmount < 0 || initAmount > 1000000) ? null : initAmount;	

	}
	
	static Double validateInterest (String yearInterestInput )
	{
		Double yearInterest= Double.parseDouble(yearInterestInput);
		
	    return (yearInterest < 0 || yearInterest > 1) ? null : yearInterest;
	}
}
