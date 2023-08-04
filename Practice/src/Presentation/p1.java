package Presentation;

public class p1 {
public static void add(int...a)
{
	int sum=0;
	for(int i=1;i<a.length;i++)
	{
		sum=sum=a[i];
	}
	System.out.println("the sum of elements is :"+sum);
}
public static void main(String[] args) {
	add(10,20);
	add(23,94,4,2,14,44,0);
	add(1,3,3,4);
}
}
