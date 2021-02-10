package Mavenproj25.Mavenproj25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();  // How to use list in collection
		list.add("Priyanka");  // how to add values in the list
        list.add("ginger");
        list.add("Aashna");
        list.add(null);
        list.add("Rudra");
        list.add("khamkha");
        list.add("Rudra");
        list.add(null);
        list.add(null);
		System.out.println(list.size());  // Getting the size of the list
		System.out.println(list); // getting all the values in the list
		System.out.println("Element at 1st position: "+list.get(1));// Getting a particular value for the list
		System.out.println("Element at 5th position: "+ list.get(5));

		list.remove(5);   // Removing a particular value from the list.

		System.out.println(list);  // Values after removing a particular value form the list
		System.out.println(list.size());

		for(int i=0;i<list.size();i++) // traversing the list using a loop
		System.out.println(list.get(i));

		




//	-------------------------*--------------------------------------
// do not allow duplicate  and allow null only once not matter how many times its there
int count[] = {1, 2,3,4,5,6,7,1,2};
Set<Integer> set = new HashSet<Integer>(); // syntax for set

for(int i = 0; i<9; i++) 
{
      set.add(count[i]); // Adding values in the set
      
}

System.out.println(set); // Getting the unique values from the set
System.out.println(set.isEmpty());
System.out.println(set.size()); // Getting the size of set
System.out.println(set.contains(2));//returns true if specific element is present
set.remove(1); // Removing value from set
System.out.println(set); // Set after removing value

//------------------------------------------*-----------------------------------------------


HashMap<Integer, String> map = new HashMap<Integer, String>();   // syntax of hash map        
map.put(1,"ashu");  // putting values in hash map
map.put(2, "Ashok");  
map.put(3, "sharma");  
  System.out.println("Values before remove: "+ map);    
  map.remove(2);  // Remove value for key 2
  System.out.println("Values after remove: "+ map);  
 
  System.out.println(map);  
  System.out.println(map.get(3)); // finding a particular key value form hash map
 
  System.out.println(map.isEmpty()); // checking map is empty or not
  System.out.println(map.size()); // Getting the size of map
  }


}
