package sample;
 import java.util.Scanner;

public class Task1 {
 public  static void  main(String[] avgs) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a = sc.nextInt();
	 if ( a%3==0 && a%5==0 ) {
		 System.out.println("3");
	 }
	 else {
		 System.out.println("Number  is not divisable by 3 and 5");
	 }
	 sc.close();
 }
}
