import java.util.Scanner;
import java.util.Random;
 class AdventureCave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerLevel=1;
		double playerHealth= 10;
		String playerAnswer;
		Scanner scan = new Scanner (System.in);
		Random ran= new Random();
		
    	  if(playerAnswer.equals("Yes")){
	        playerLevel = playerLevel + 1;
	        System.out.println("You leveled up. You are now level " + playerLevel);
       }
        else{
          System.out.println("We were just getting to the good part :(");
          System.out.println("Game Over!");
          System.exit(0);
         }
        	System.out.println("Welcome warrior, are you prepared for the trials that await you?");
		System.out.println("What is your title?");
		String name=scan.nextLine();
		System.out.println("You are "+ name+ " a level "+playerLevel+" warrior");
		
		 // Arithmetic with variables
		System.out.println("You made it to the entrance of the cave.");
        System.out.println("Do you enter the cave? Yes or No?");
        playerAnswer=scan.nextLine();
        // Rock falling and causing damage
        double rockDamage = ran.nextInt(5);
        System.out.println("A treacherous rock ambushes you.");
        playerHealth -= rockDamage;
        System.out.println("You took " + rockDamage
                + " damage. You have " + playerHealth
                + " health remaining.");
        
        // Found a fountain
        System.out.println("You find a fountain, do you drink from it? Yes or No?");
        playerAnswer=scan.nextLine();
        playerLevel++;
        if(playerAnswer.equals("Yes")){
        	System.out.println("Blech! The water is poisonous! You took 1 damage.");
        	playerHealth--;
        }
        else{
        	System.out.println("You walk away just as the water turns a sickly green");
        }
        
        
        //Check for Death
        if( playerHealth <= 0 ){ 
        	System.out.println("Oh no, "
                 + name +" died! They were level "
                    + playerLevel);
        }
        
        //Choose a path
        
        System.out.println("You are in a cave."
                + "\nThere is a dark path to the left."
                + "\nThere is a pile of rubble to the right."
                + "\nWould you like to go 'left' or 'right'?");
        // get player's answer
        playerAnswer = scan.nextLine();
         
        if(playerAnswer.equalsIgnoreCase("right")){
            System.out.println("You climb up the pile of rubble. It leads to a small cavern."
                    + "\nThere is a treasure chest here. It is full of treasure.");
            playerLevel++;
            System.out.println("You leveled up. You are now level " + playerLevel);
        }
        else if(playerAnswer.equalsIgnoreCase("left")){
        	System.out.println("The path gets very dark. Another cunning rock ambushes you.");
            rockDamage = 4.0;
            playerHealth -= rockDamage;
            System.out.println("You took " + rockDamage
                    + " damage. You have " + playerHealth
                    + " health remaining.");
             
            if( playerHealth <= 0 ){ 
 
                System.out.println("Oh no, "
                     + name +" died! They were level "
                        + playerLevel);
                System.exit(0);
 
            }
        }
         
        scan.close();
		
		
	}

}