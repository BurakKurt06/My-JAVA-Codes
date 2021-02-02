import javax.swing.JOptionPane;

public class Main {
//NOTE = Tested. Works in all kinds of discount calculations
	public static void main(String[] args) {
  /*The programming process (p.38) PIPO
  * Purpose - To describe the discounted price
  * Input - Original Price, Discount Amount, Discount Rate, Sale Price
  * Process - Calculating
  * Output - Sale Price   
  */
		 String input;
     int OriginalPrice;
		 double DiscountAmount,  SalePrice, DiscountRate;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate discounts! ");

		 input = JOptionPane.showInputDialog(" How much is the Original Price? ");
		 OriginalPrice = Integer.parseInt(input);

		 input= JOptionPane.showInputDialog(" How many percent discounts? ");
		 DiscountRate = Double.parseDouble(input);
     DiscountAmount = ((OriginalPrice * DiscountRate) / 100);
     SalePrice = ( OriginalPrice-DiscountAmount );

		 JOptionPane.showMessageDialog(null, " Discount Calculation\n====================\nOriginal Price:   $"+ OriginalPrice +"\nDiscount Rate:  %"+ DiscountRate +"\nSavings: $ "+ DiscountAmount +"\n\n SalePrice: $"+ SalePrice +"\nThanks for choosing to use our calculator."); 

	 }
	
}