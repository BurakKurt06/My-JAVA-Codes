import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
//=============================================    
    //Discount Price - CODE 1
{
  Scanner scan = new Scanner( System.in );
	double purchase;
	
	System.out.print("Enter the amount of purchase: ");
	purchase = scan.nextDouble();
	
 if (purchase > 10) 
	   System.out.println("discounted price: " + (purchase - purchase/10) +"$"); } 
//=============================================  
       
    //Pie Eating - CODE 2
/*{
   Scanner scan = new Scanner( System.in );
    double weight;
    System.out.print("How many pounds are you?");
    weight = input.nextDouble();

    if (weight >= 250)
    if (weight <= 500) 
    System.out.println(""+ weight +" You can participate in the contest.");
     else
    System.out.println(""+ weight +" You cannot participate in the contest. Your weight measurements do not match.");
    } */

//=============================================
     //Order Checker - CODE 3
/* {
		Scanner input = new Scanner(System.in);
		double cost, bolts, nuts, washers, washers2;

		//Ejecucion

		System.out.println("\nPlease introduce the number of bolts you wish to buy");
		bolts = input.nextDouble();

		System.out.println("Please introduce the number of nuts you wish to buy");
		nuts = input.nextDouble();

		System.out.println("Please introduce the number of washers you wish to buy");
		washers = input.nextDouble();

    washers2 = (washers * washers);
		if (bolts > nuts)
    if ((bolts + nuts) < washers2){
			System.out.println("Check the order");
			System.out.println("Total amount will not be calculated");
    }else{ 
			cost = (bolts * .05) + (nuts * .03) + (washers * .01);
			System.out.println("Order is OK");
			System.out.println("The total cost is:" + cost); */
    }
    }
//=============================================
    }
