package package1;

import java.util.ArrayList;

public class listarray {
	
	
public static void main(String[] args) {
	 int num=4546;
	 ArrayList al=new ArrayList();
	 while (num>0) {
		int rem=num%10;
		al.add(rem);
		num=num/10;
	}
	 System.out.println(al);
	
		
	}
	
	
}

