package javaProject;
// java program to illustrate HashMap.
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer>map= new HashMap<>();
		System.out.println(map);
		map.put("abc", 10);
		map.put("mno", 20);
		map.put("bcd", 30);
		map.put("pqr", 40);
		System.out.println("The size of the map is:"+ map.size());
		print(map);

		if(map.containsKey("abc")) {
			Integer a=map.get("abc");
			System.out.println("Value for key is\"key\"is:-"+a);
		}
		map.clear();
		print(map);
			
		
	}
	private static void print(HashMap<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("Map is Empty!");
		}else {
			System.out.println(map);
		}
		
		
	}
	

	

}
