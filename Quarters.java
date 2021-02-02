import java.util.Scanner;
//Header:
//Name = Burak Kurt 
//Teacher = Brendan McCann
//Project Name = Quarters
//Date = 10/16/2020  
class Main {
  public static void main(String[] args) {
     String input;
     int Quarter1, Quarter2, Quarter3, Quarter4;
     double total;
     Scanner keyboard = new Scanner(System.in);

		 System.out.println( "\nHello let's calculate produce a company report that displays the sales for each quarter of the year!");
     
		 System.out.print(" \nHow much did you earn in the 1st quarter? ");
     Quarter1 = keyboard.nextInt();
     System.out.print(" \nHow much did you earn in the 2nd quarter? ");
     Quarter2 = keyboard.nextInt();
     System.out.print(" \nHow much did you earn in the 3rd quarter? ");
     Quarter3 = keyboard.nextInt();
     System.out.print(" \nHow much did you earn in the 4th quarter? ");
     Quarter4 = keyboard.nextInt();

     total = ( Quarter1 + Quarter2 + Quarter3 + Quarter4 );

		 System.out.println( "\nBurak Company \nQuarter1 -\t"+ Quarter1 +"\nQuarter2 -\t"+ Quarter2 +"\nQuarter3 -\t"+ Quarter3 +"\nQuarter4 -\t"+ Quarter4 +" \n\t\t\t---- \n\t\t\t"+ total +" ");
   
    /*
    // -> This code has a Dialog Box <-
    import javax.swing.JOptionPane;
    String input;
     int Quarter1, Quarter2, Quarter3, Quarter4;
     double total;
		 JOptionPane.showMessageDialog(null, "Hello let's calculate produce a company report that displays the sales for each quarter of the year");
		 input = JOptionPane.showInputDialog(" How much did you earn in the 1st quarter ");
     Quarter1 = Integer.parseInt(input);
     input = JOptionPane.showInputDialog(" How much did you earn in the 2nd quarter ");
     Quarter2 = Integer.parseInt(input);
     input = JOptionPane.showInputDialog(" How much did you earn in the 3rd quarter ");
     Quarter3 = Integer.parseInt(input);
     input = JOptionPane.showInputDialog(" How much did you earn in the 4th quarter ");
     Quarter4 = Integer.parseInt(input);

     total = ( Quarter1 + Quarter2 + Quarter3 + Quarter4 );

		 JOptionPane.showMessageDialog(null, "Burak Company \nQuarter1 -\t"+ Quarter1 +"\nQuarter2 -\t"+ Quarter2 +"\nQuarter3 -\t"+ Quarter3 +"\nQuarter4 -\t"+ Quarter4 +" \n\t---- \n\t"+ total +" ");
      */ /*
     For Your Information
     Quarter 1 earnings = 750
     Quarter 2 earnings = 1240
     Quarter 3 earnings = 1875
     Quarter 4 earnings = 2200
     Total = 6065
     */
  }
}