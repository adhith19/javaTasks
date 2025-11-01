package sample;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
 public static void main(String[] args ) {
	 HashMap<String,Double> studentGrades = new HashMap<>();
	 Scanner scan = new Scanner(System.in);
	 while(true) {
		 
 System.out.println("1. Add Student grade");
 System.out.println("2. Get student grade");
 System.out.println("3. Update student grade");
 System.out.println("4. Remove student grade");
 System.out.println("5. Exit");
 System.out.println("Choose an option");
   int option = scan.nextInt();
   scan.nextLine();
   switch(option) {
   case 1:
	   System.out.println("Enter student name: ");
	   String name = scan.nextLine();
	   System.out.println("Enter student grade");
	   double grade= scan.nextDouble();
	   scan.nextLine();
	   studentGrades.put(name, grade);
	   break;
	   
   case 2:
	   System.out.println("Enter student name: ");
	   String student = scan.nextLine();
	   System.out.println("Grade: " + studentGrades.get(student));
	   break;
   case 3:
   	   System.out.println("Enter student name :");
   	   name = scan.nextLine();
   	System.out.println("Enter new grade:");
   	grade = scan.nextDouble();
   	scan.nextLine();
   	studentGrades.put(name, grade);
   	break;
   case 4:
	   System.out.println("Enter student name:");
	   name = scan.nextLine();
	   studentGrades.remove(name);
	   break;
   case 5:
	   System.exit(0);
	   default :
		   System.out.println("Invalid option");
	   
	   
   }
   
	}
	 
			 
 }
}
