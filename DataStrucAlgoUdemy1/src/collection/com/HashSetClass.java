package collection.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

 
public class HashSetClass {

	public static void main(String args[]){  
		   
		  HashSet<String> al=new HashSet<String>();  
		  al.add("Rajib");
		  al.add("Mehedi");
		  al.add("Fahad");
		  al.add("Alam");
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  System.out.println("linked hash set");
		  // linked
		  LinkedHashSet<String> al2=new LinkedHashSet<String>();  
		  al2.add("Munna");
		  al2.add("Salim");
		  al2.add("Faruk");
		  al2.add("Anik");
		  
		  Iterator<String> itr2=al2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  
		 } 
	  
}
