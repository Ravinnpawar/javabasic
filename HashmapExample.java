import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(1, "One");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		hashmap.put(4, "Four");
		hashmap.put(5, "Five");
		
		for(Map.Entry map: hashmap.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
	}

}
