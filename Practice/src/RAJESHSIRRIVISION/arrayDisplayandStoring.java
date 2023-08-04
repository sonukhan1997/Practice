package RAJESHSIRRIVISION;

import java.util.Scanner;

public class arrayDisplayandStoring {
public static int[] store() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of elements in an array");
	int size = sc.nextInt();
	System.out.println("elements of the array");
	int[]a=new int[size];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	return a;
}

public static void display(int[]b) {
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}

public static void main(String[] args) {
	int[]a=store();
	display(a);
}
}
