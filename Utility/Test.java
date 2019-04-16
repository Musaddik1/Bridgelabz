package com.BridgelabzAlgo;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String string1 = "abc";
		String string2 = "bac";
		Utility utility = new Utility();
		int y=Integer.parseInt(args[0]);
		int p=Integer.parseInt(args[1]);
		int i=Integer.parseInt(args[2]);
		Utility.MonthlyPayment(y, p, i);
		/*
		 * //utility.IsAnagram(string1, string2); Scanner scanner=new
		 * Scanner(System.in); System.out.println("Enter number :"); int
		 * number=scanner.nextInt(); utility.Sqrt(number);
		 * 
		 * System.out.println("Enter your Choice :"); int choice=scanner.nextInt();
		 * utility.TempratureCon(choice);
		 */
		/*
		 * int d=Integer.parseInt(args[0]); int m=Integer.parseInt(args[1]); int
		 * y=Integer.parseInt(args[2]); Utility utility=new Utility();
		 * utility.DayofWeek(d, m, y);
		 * 
		 * Utility utility=new Utility(); String string; Scanner scanner=new
		 * Scanner(System.in); System.out.println("Enter string  :");
		 * string=scanner.next(); string=utility.InsertionString(string);
		 * System.out.println(string);
		 * 
		 * 
		 * /* String binary="1010"; int no=Integer.parseInt(binary,2);
		 * System.out.println(no);
		 */
		/*
		 * String string="musaddik"; Utility utility=new Utility();
		 * utility.InsertionString(string);
		 */
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("enter array size"); int size=scanner.nextInt(); int
		 * array[]=new int [size]; Utility utility=new Utility();
		 * array=utility.ScannerIntArray(array); utility.BinaryInt(array);
		 */
	}

}
