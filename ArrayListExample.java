package sample;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Black");
		System.out.println("Colors:" + colors);
		System.out.println(" Frist Colors:" + colors.get(0));
		colors.set(0, "Purple");
		System.out.println("Updated colors : "+ colors);
		colors.remove("Green");
		System.out.println("Colors after removal: " +colors);
		System.out.println("Does color contain Blue? "+ colors.contains("Blue"));
		System.out.println("Number of colors: " +colors.size());
		for(String color : colors) {
			System.out.println(color);
		}
		
		
	}

}
