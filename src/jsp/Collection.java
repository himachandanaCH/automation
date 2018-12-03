package jsp;

import java.util.ArrayList;



public class Collection {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<>();
		a1.add("a");
		a1.add("b");
		a1.add("b");
		a1.add(null);
		int count = a1.size();
		System.out.println(count);
		//for(int i=0;i<count;i++) {
			//String d = a1.get(i);
			//System.out.println(d);
		
		//}
		for(String d:a1) {
			System.out.println(d);
		}
		
		

	}

}
