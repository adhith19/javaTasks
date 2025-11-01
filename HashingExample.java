package sample;
import java.util.HashMap;

public class HashingExample {
	 public static void main(String[] args) {
		 HashMap<String, Integer> hashmap = new HashMap<>();
		 
		 hashmap.put("John", 25);
		 hashmap.put("Alice", 35);
		 hashmap.put("Bob", 34);
		 System.out.println("John's age: " + hashmap);
		 System.out.println("Alice's age: " + hashmap);
		 System.out.println("Bob's age: " + hashmap);
 hashmap.put("John", 26);
 System.out.println("John's updated  age: " + hashmap.get("John"));
 hashmap.remove("Alice");
 System.out.println("Is Alice in the HashMap? " + hashmap.containsKey("Alice"));
 
	 }

}
