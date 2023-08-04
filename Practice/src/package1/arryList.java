package package1;

import java.util.ArrayList;
import java.util.Collections;

public class arryList {

	public static void main(String[] args) {
		ArrayList<String> Al=new ArrayList<String>();
		Al.add("Sonu");
		Al.add("Sanket");
		Al.add("Shakti");
		Al.add("Sandesh");
		Al.add("Yogendra");
		System.out.println(Al);
		Collections.sort(Al);
		System.out.println(Al);
	}
	
	
}
