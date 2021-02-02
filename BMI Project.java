import javax.swing.JOptionPane;

public class Main {
//NOTE = Tested. Works in all kinds of discount calculations
	public static void main(String[] args) {
  /* PIPO
  * Purpose - To describe the sales prediction price
  * Input - TotalSales, EastCoastSales
  * Process - Calculating
  * Output - sales prediction   
  */
		 String input;
     int name;
     double BMI, height, weight;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate your BMI! ");

		 input = JOptionPane.showInputDialog("How many centimeters are your height? ");
		 height = Double.parseDouble(input); 

     input = JOptionPane.showInputDialog("How many kilograms are your weight? ");
     weight = Double.parseDouble(input); 

     BMI = (weight / (height * height)) * 10000;

		JOptionPane.showMessageDialog(null, "Body Mass Index Calculator\n=========================\nYour details are:\nHeight ="+ height +"\nWeight ="+ weight +"\n### BMI ="+ BMI +"###\n=========================\n Underweight = less than 18.5\nNormal weight =18.5 to 24.9\nOverweight = 25 to 29.9\nObesity = 30 or greater\n========================="); 
  }
}