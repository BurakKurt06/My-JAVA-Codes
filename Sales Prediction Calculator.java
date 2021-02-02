import javax.swing.JOptionPane;

public class Main {
//NOTE = Tested. Works in all kinds of discount calculations
	public static void main(String[] args) {
  /*The programming process (p.38) PIPO
  * Purpose - To describe the sales prediction price
  * Input - TotalSales, EastCoastSales
  * Process - Calculating
  * Output - sales prediction   
  */
		 String input;
     int TotalSales;
		 double EastCoastSales;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate Sales Prediction! ");

		 input = JOptionPane.showInputDialog(" How much is the Total Sales? ");
		 TotalSales = Integer.parseInt(input);

     // IMPORTANT!! = Please start instead of "0" of your Percent. For example, if 65 percent, write "0.65".
     input = JOptionPane.showInputDialog(" How much is the East Coast Sales? ");
		 EastCoastSales = Double.parseDouble(input);

     EastCoastSales = ( TotalSales*EastCoastSales );

		 JOptionPane.showMessageDialog(null, " Sales Calculation for East Coast Division \n=============================================\n\nProjected Sales for the entire company = $"+ TotalSales +"\nEast Coast Division represents %65.0 of the total company.\n\nProjected sales for the East Coast Division = $"+ EastCoastSales +".\nThanks for choosing to use our calculator");
	 }
	
}