package RAJESHSIRRIVISION;

import java.util.Scanner;

class array {
	public static void main(String[] args) 
		{
		int [] a =takevalue();
		printvalue(a);
		
		}

		public static int[] takevalue()
	    {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("enter code one by one but it should be integer value");
		for (int i = 0; i < a.length; i++)
			{

			a[i]=sc.nextInt();
		    }
			return a;
		}

		public static void printvalue(int [] input)
		{
			for (int i = 0; i < input.length; i++)
				{
		
			System.out.println(input[i]);
		         }
		} 
}