import java.util.ArrayList;
import java.util.List;
public class Arraylist{
		public static void main(String args[]){
			
			List<String> al = new ArrayList<String>();   	 //Arraylist created
			al.add("Apple"); 			     	// Element added		
			al.add("Banana");				// Element added
			al.add("Grapes");				// Element added
			al.set(0,"Orange");				// replace 0 index element with new element
			System.out.println(al);				// Print output
			
					
			System.out.println(al.indexOf("Banana"));	// index number of string Banana in list
			System.out.println(al.size());			// size of element
			System.out.println(al);
			System.out.println(al.isEmpty());		// Clear all Elements
			System.out.println("All list is cleared"+al);
							}
			}