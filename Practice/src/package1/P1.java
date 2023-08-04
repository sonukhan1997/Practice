package package1;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
       int n=1234;
       ArrayList al=new ArrayList();
       while(n>0)
       {
    	   int rem=n%10;
    	   al.add(rem);
    	   n=n/10;
    	   
       }
       System.out.println(al);
	}

}
