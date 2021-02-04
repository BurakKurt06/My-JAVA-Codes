import java.util.Scanner;
 public class Main
 {
 public static void main(String[] args)
 {
 String input;
 double number1, number2; 
 double average;
 char repeat; 
 Scanner keyboard = new Scanner(System.in);
 do
 {
	 System.out.print("\nEnter score:");
	 number1 = keyboard.nextDouble();
	 System.out.print("Enter score:");
	 number2 = keyboard.nextDouble();

	 average = ((number1 + number2) / 2.0);
	 System.out.println("The average is " + average);
	 System.out.println();

	 System.out.println("Do you want to average another thing?");
	 System.out.print("Enter: \n->Y or y for yes || ->N or n for no:");
	 input = keyboard.next(); 
	 repeat = input.charAt(0); 

 } while (repeat == 'Y' || repeat == 'y');
}
}