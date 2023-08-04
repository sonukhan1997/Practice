package RAJESHSIRRIVISION;

import java.util.Arrays;
import java.util.Scanner;

public class arrayStoreAndDisplay {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.of elements to be present in an array");
	int size=sc.nextInt();
	int[]a=new int[size];
	System.out.println("enter the elements to be present in the array");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
  for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}	
  
  Arrays.sort(a);
  for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
}
}
