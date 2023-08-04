package RAJESHSIRRIVISION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	int sum=0;
	for(Object i:al) {
		int temp=(Integer)i;
		sum=sum+temp;
	}
	System.out.println(sum);
	
	
}
}
