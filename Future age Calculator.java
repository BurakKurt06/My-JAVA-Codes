import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 String name; 
		 String input;
		 int AgeNow;
		 double FutureAgeReal, FutureAgeWant; 

		 JOptionPane.showMessageDialog(null, "Hello let's calculating your future age");

		 
		 // Get the user's name.
		 name= JOptionPane.showInputDialog(" What is your name? ");
		 

		 // Get the number of hours worked this week.
		 input = JOptionPane.showInputDialog(" How old are you now? ");
		 AgeNow= Integer.parseInt(input);
		 
		 // Get the user's hourly pay rate.
		 input= JOptionPane.showInputDialog(" How many years in future you want to learn how old are you? ");
		 FutureAgeWant = Double.parseDouble(input);

		 // Calculate the gross pay.
		 FutureAgeReal = AgeNow + FutureAgeWant;

		 // Display the resulting information.
		 JOptionPane.showMessageDialog(null, "Hello " + name + " you will be  "+ FutureAgeWant +" years old in "+ FutureAgeReal +" years ");
	 }
	
}