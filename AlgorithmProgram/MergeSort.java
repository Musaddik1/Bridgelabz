package BridgelabzAlgo;

import java.util.Scanner;

public class MergeSort {
	
	public static void merge(int merge[],int l,int mid,int h)
	{
		int i=0,j=0,k=0;
		int n1=mid-l+1;
		int n2=h-mid;
		int array1[]= new int[n1];
		int array2[]=new int [n2];
		for( k=0;k<merge.length;k++)
		{
			array1[k]=merge[l+1];
		}
		for(j=0;j<n2;j++)
		{
			array2[j]=merge[mid+1+j];
		}
		i=0;k=0;j=0;
		while(i<=n1&&j<=n2)
		{
			if(array1[i]<array2[j])
			{
				merge[k]=array1[i];
				k++;
				i++;
			}
			else
			{
				merge[k]=array2[j];
				k++;
				j++;
			}
		}
		for(;i<=n1;i++)
		{
			merge[k]=array1[i];
			k++;
		}
		for(;j<=n2;j++)
		{
			merge[k]=array2[j];
			k++;
		}
		
	}
	public static void mergesort(int array[],int l,int h)
	{
		if(l<h)
		{
			int mid=(l+h)/2;
			mergesort(array, l, mid);
			mergesort(array, mid+1, h);
			merge(array, l, mid, h);
		}
		else
		{
			for(int m=0;m<array.length;m++)
			{
				System.out.println(array[m]);
			}
		}
		
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter size of array :");
		number=scanner.nextInt();
		int array[]=new int[number];
		System.out.println("Enter Array element :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		int l=0,h=number;
		MergeSort.mergesort(array, l, h);
		for(int var :array)
		{
			System.out.println(var);
		}
	}

}
