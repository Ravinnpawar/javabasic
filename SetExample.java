import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Set - it is an interface from collection.It will accept only unique elements - Duplicates not allowed. 
//Unordered elements in set.
//Max one is allowed as null.
//HashSet-- It is extends AbstractSet- Unique elements. Unodered- It does not maintain any order, Hashtable is used to store the data(Hashing machanism). 
//In Hashing Mechanism - There is hashcode for every element.
//Linkedhashset-- It extends the Hashset- Unique elements- It maintains insertion order. 
//TreeSet-- Sorted set- elements are sorted in ascending order.
//			It is also having only unique elements.

public class SetExample {
public static void main(String[] args) {
		
	//TreeSet
	TreeSet<String> treeSet=new TreeSet<String>();
	
	treeSet.add("A");
	treeSet.add("B");
	treeSet.add("G");
	treeSet.add("E");
	treeSet.add("D");
	treeSet.add("F");
	
	System.out.println(treeSet);
	
		/*	//LinkedHashSet Example
		 * LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		 * 
		 * linkedHashSet.add("A"); linkedHashSet.add("B"); linkedHashSet.add("C");
		 * linkedHashSet.add("E"); linkedHashSet.add("D"); linkedHashSet.add("F");
		 * 
		 * System.out.println(linkedHashSet);
		 */
	
	
	
	
	
	
	
	
	/*		//Hashset Example
		 * HashSet<String> hashSet=new HashSet<String>();
		 * 
		 * hashSet.add("A"); hashSet.add("B"); hashSet.add("C"); hashSet.add("E");
		 * hashSet.add("D"); hashSet.add("F");
		 * 
		 * System.out.println(hashSet);
		 */
	
}
}
