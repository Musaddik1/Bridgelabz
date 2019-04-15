package com.BridgelabzFun;

public class Power {
	
	public static void main(String[] args) {
		
		int number=Integer.parseInt(args[0]);
		int i;
		if(number>0&&number<=31)
		{
			for(i=1;i<=number;i++)
			{
			System.out.println("2^"+i+"  "+(int)Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("Int overflow ");
		}
		
		
	}

}
