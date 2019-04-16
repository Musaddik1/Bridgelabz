package BridgelabzAlgo;

import java.util.Scanner;

public class GuessNumber {
	static Scanner scanner=new Scanner(System.in);
	public static void Number(int first,int last)
	{
		int mid=(first+last)/2;
		while(first<last)
		{
			System.out.println("Is your number between "+first+"and "+mid+"[y/n]");
			char choice=scanner.next().charAt(0);
			if(choice=='Y'||choice=='y')
			{
				Number(first, mid);
			}
			else if(choice=='N'||choice=='n')
			{
				Number(mid+1,last);
			}
			else
			{
				System.out.println("number found at last index ");
			}                        
		}
		
	}
	public static void main(String[] args) {
		
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		/*
		 * System.out.println("Enter first number :"); int first=scanner.nextInt();
		 * System.out.println("Enter last number :"); int last=scanner.nextInt();
		 */
		GuessNumber.Number(first, last);
		
	}

}
