import java.util.Scanner;
import java.util.*;

 class Main
{
     public static void main(String[] args)
     {
		Scanner scan = new Scanner (System.in);       
          String answer;               
          System.out.println("Do you want to play the difficult riddles or the easy riddles? Pls only write (Easy) or (Difficult).");
          answer=scan.nextLine();
//EASY=================================================================================================================  
    	  if(answer.equals("Easy")){
          System.out.println(".");
          System.out.println("About Easy Riddles:");
          System.out.println("There are 3 easy riddles in here.");
          System.out.println("!! All riddles are case sensitive !!");
          System.out.println(".");

          System.out.println(".");
          System.out.println("Riddle 1");
          System.out.println("David’s parents have three sons: Snap, Crackle, and what’s the name of the third son?");
          answer=scan.nextLine();

    	  if(answer.equals("David")){
	        System.out.println("Congratulations! True. Let's go to the next riddle.");
       }
        else{
          System.out.println("False! Answer was -> David <- :(");
          System.out.println("Start the game from the beginning.");
          System.exit(0);
        }
//=========================================================================================================================        
          System.out.println(".");
          System.out.println("Riddle 2");
          System.out.println("I’m found in socks, scarves and mittens; and often in the paws of playful kittens. What am I?");
          answer=scan.nextLine();

    	  if(answer.equals("Yarn")){
	        System.out.println("Congratulations! True. Let's go to the next riddle.");
       }
        else{
          System.out.println("False! Answer was -> Yarn <- :(");
          System.out.println("Start the game from the beginning.");
          System.exit(0);
        }
//=========================================================================================================================
          System.out.println(".");
          System.out.println("Riddle 3");
          System.out.println("You use knife to slice my head and start to weep beside me when I am dead. What am I?");
         answer=scan.nextLine();
    	  if(answer.equals("Onion")){

 System.out.println("░█████╗░░█████╗░███╗░░██╗░██████╗░██████╗░░█████╗░████████╗██╗░░░██╗██╗░░░░░░█████╗░████████╗██╗░█████╗░███╗░░██╗░██████╗██╗");
 System.out.println("██╔══██╗██╔══██╗████╗░██║██╔════╝░██╔══██╗██╔══██╗╚══██╔══╝██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║██╔════╝██║");
 System.out.println("██║░░╚═╝██║░░██║██╔██╗██║██║░░██╗░██████╔╝███████║░░░██║░░░██║░░░██║██║░░░░░███████║░░░██║░░░██║██║░░██║██╔██╗██║╚█████╗░██║");
 System.out.println("██║░░██╗██║░░██║██║╚████║██║░░╚██╗██╔══██╗██╔══██║░░░██║░░░██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║██║░░██║██║╚████║░╚═══██╗╚═╝");
 System.out.println("╚█████╔╝╚█████╔╝██║░╚███║╚██████╔╝██║░░██║██║░░██║░░░██║░░░╚██████╔╝███████╗██║░░██║░░░██║░░░██║╚█████╔╝██║░╚███║██████╔╝██╗");
 System.out.println("░╚════╝░░╚════╝░╚═╝░░╚══╝░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═════╝░╚═╝");

 System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ░█████╗░███╗░░██╗░██████╗░██╗░░░░░░░██╗███████╗██████╗░███████╗██████╗░");
 System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔══██╗████╗░██║██╔════╝░██║░░██╗░░██║██╔════╝██╔══██╗██╔════╝██╔══██╗");
 System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ███████║██╔██╗██║╚█████╗░░╚██╗████╗██╔╝█████╗░░██████╔╝█████╗░░██║░░██║");
 System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ██╔══██║██║╚████║░╚═══██╗░░████╔═████║░██╔══╝░░██╔══██╗██╔══╝░░██║░░██║");
 System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ██║░░██║██║░╚███║██████╔╝░░╚██╔╝░╚██╔╝░███████╗██║░░██║███████╗██████╔╝");
 System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░░░░╚═╝░░░╚═╝░░╚══════╝╚═╝░░╚═╝╚══════╝╚═════╝░");

 System.out.println("░█████╗░██╗░░░░░██╗░░░░░  ████████╗██╗░░██╗███████╗");
 System.out.println("██╔══██╗██║░░░░░██║░░░░░  ╚══██╔══╝██║░░██║██╔════╝");
 System.out.println("███████║██║░░░░░██║░░░░░  ░░░██║░░░███████║█████╗░░");
 System.out.println("██╔══██║██║░░░░░██║░░░░░  ░░░██║░░░██╔══██║██╔══╝░░");
 System.out.println("██║░░██║███████╗███████╗  ░░░██║░░░██║░░██║███████╗");
 System.out.println("╚═╝░░╚═╝╚══════╝╚══════╝  ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝");

 System.out.println("███████╗░█████╗░░██████╗██╗░░░██╗");
 System.out.println("██╔════╝██╔══██╗██╔════╝╚██╗░██╔╝");
 System.out.println("█████╗░░███████║╚█████╗░░╚████╔╝░");
 System.out.println("██╔══╝░░██╔══██║░╚═══██╗░░╚██╔╝░░");
 System.out.println("███████╗██║░░██║██████╔╝░░░██║░░░");
 System.out.println("╚══════╝╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░");

 System.out.println("██████╗░██╗██████╗░██████╗░██╗░░░░░███████╗░██████╗    █████╗░░█████╗░██████╗░██████╗░███████╗░█████╗░████████╗██╗░░░░░██╗░░░██╗");
 System.out.println("██╔══██╗██║██╔══██╗██╔══██╗██║░░░░░██╔════╝██╔════╝   ██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗╚══██╔══╝██║░░░░░╚██╗░██╔╝");
 System.out.println("██████╔╝██║██║░░██║██║░░██║██║░░░░░█████╗░░╚█████╗    ██║░░╚═╝██║░░██║██████╔╝██████╔╝█████╗░░██║░░╚═╝░░░██║░░░██║░░░░░░╚████╔╝░");
 System.out.println("██╔══██╗██║██║░░██║██║░░██║██║░░░░░██╔══╝░░░╚═══██╗   ██║░░██╗██║░░██║██╔══██╗██╔══██╗██╔══╝░░██║░░██╗░░░██║░░░██║░░░░░░░╚██╔╝░░");
 System.out.println("██║░░██║██║██████╔╝██████╔╝███████╗███████╗██████╔╝    █████╔╝╚█████╔╝██║░░██║██║░░██║███████╗╚█████╔╝░░░██║░░░███████╗░░░██║░░░");
 System.out.println("╚═╝░░╚═╝╚═╝╚═════╝░╚═════╝░╚══════╝╚══════╝╚═════╝    ╚════╝░░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝░╚════╝░░░░╚═╝░░░╚══════╝░░░╚═╝░░░░");

 System.out.println("░██████╗░░█████╗░░█████╗░██████╗░  ░░░░░██╗░█████╗░██████╗░██╗");
 System.out.println("██╔════╝░██╔══██╗██╔══██╗██╔══██╗  ░░░░░██║██╔══██╗██╔══██╗██║");
 System.out.println("██║░░██╗░██║░░██║██║░░██║██║░░██║  ░░░░░██║██║░░██║██████╦╝██║");
 System.out.println("██║░░╚██╗██║░░██║██║░░██║██║░░██║  ██╗░░██║██║░░██║██╔══██╗╚═╝");
 System.out.println("╚██████╔╝╚█████╔╝╚█████╔╝██████╔╝  ╚█████╔╝╚█████╔╝██████╦╝██╗");
 System.out.println("░╚═════╝░░╚════╝░░╚════╝░╚═════╝░  ░╚════╝░░╚════╝░╚═════╝░╚═╝");
        }
        else{
          System.out.println("False! Answer was -> Onion <- :(");
          System.out.println("Start the game from the beginning.");
          System.exit(0); 
        }         
       }

//DIFFICULT==============================================================================================================  

    	  if(answer.equals("Difficult")){
	        System.out.println("Okay. Let's go to the Difficult riddles.");
          System.out.println(".");
          System.out.println("About Difficult Riddles:");
          System.out.println("There are 3 difficult riddles in here.");
          System.out.println("!! All riddles are case sensitive !!");
          System.out.println(".");

          System.out.println(".");
          System.out.println("Riddle 1");
          System.out.println("What English word has three consecutive double letters?");
          answer=scan.nextLine();

    	  if(answer.equals("Bookkeeper")){
	        System.out.println("Congratulations! True. Let's go to the next riddle.");
       }
        else{
          System.out.println("False! Answer was -> Bookkeeper <- :(");
          System.out.println("Start the game from the beginning.");
          System.exit(0);
        }
//=========================================================================================================================        
          System.out.println(".");
          System.out.println("Riddle 2");
          System.out.println("Mr. and Mrs. Mustard have six daughters and each daughter has one brother. How many people are in the Mustard family?");
          answer=scan.nextLine();

    	  if(answer.equals("9")){
	        System.out.println("Congratulations! True. Let's go to the next riddle.");
       }
        else{
          System.out.println("False! Answer was -> 9 <- :(");
          System.out.println("WHY: There are nine Mustards in the family. Since each daughter shares the same brother, there are six girls, one boy and Mr. and Mrs. Mustard.(Please write the answer in numbers only.)");
          System.out.println("Start the game from the beginning.");
          System.exit(0);
        }
//=========================================================================================================================
          System.out.println(".");
          System.out.println("Riddle 3");
          System.out.println("I am something people love or hate. I change peoples appearances and thoughts. If a person takes care of them self I will go up even higher. To some people I will fool them. To others I am a mystery. Some people might want to try and hide me but I will show. No matter how hard people try I will Never go down. What am I?");
         answer=scan.nextLine();

    	  if(answer.equals("Age")){
 System.out.println("░█████╗░░█████╗░███╗░░██╗░██████╗░██████╗░░█████╗░████████╗██╗░░░██╗██╗░░░░░░█████╗░████████╗██╗░█████╗░███╗░░██╗░██████╗██╗");
 System.out.println("██╔══██╗██╔══██╗████╗░██║██╔════╝░██╔══██╗██╔══██╗╚══██╔══╝██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║██╔════╝██║");
 System.out.println("██║░░╚═╝██║░░██║██╔██╗██║██║░░██╗░██████╔╝███████║░░░██║░░░██║░░░██║██║░░░░░███████║░░░██║░░░██║██║░░██║██╔██╗██║╚█████╗░██║");
 System.out.println("██║░░██╗██║░░██║██║╚████║██║░░╚██╗██╔══██╗██╔══██║░░░██║░░░██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║██║░░██║██║╚████║░╚═══██╗╚═╝");
 System.out.println("╚█████╔╝╚█████╔╝██║░╚███║╚██████╔╝██║░░██║██║░░██║░░░██║░░░╚██████╔╝███████╗██║░░██║░░░██║░░░██║╚█████╔╝██║░╚███║██████╔╝██╗");
 System.out.println("░╚════╝░░╚════╝░╚═╝░░╚══╝░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═════╝░╚═╝");

 System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ░█████╗░███╗░░██╗░██████╗░██╗░░░░░░░██╗███████╗██████╗░███████╗██████╗░");
 System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔══██╗████╗░██║██╔════╝░██║░░██╗░░██║██╔════╝██╔══██╗██╔════╝██╔══██╗");
 System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ███████║██╔██╗██║╚█████╗░░╚██╗████╗██╔╝█████╗░░██████╔╝█████╗░░██║░░██║");
 System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ██╔══██║██║╚████║░╚═══██╗░░████╔═████║░██╔══╝░░██╔══██╗██╔══╝░░██║░░██║");
 System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ██║░░██║██║░╚███║██████╔╝░░╚██╔╝░╚██╔╝░███████╗██║░░██║███████╗██████╔╝");
 System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░░░░╚═╝░░░╚═╝░░╚══════╝╚═╝░░╚═╝╚══════╝╚═════╝░");

 System.out.println("░█████╗░██╗░░░░░██╗░░░░░  ████████╗██╗░░██╗███████╗");
 System.out.println("██╔══██╗██║░░░░░██║░░░░░  ╚══██╔══╝██║░░██║██╔════╝");
 System.out.println("███████║██║░░░░░██║░░░░░  ░░░██║░░░███████║█████╗░░");
 System.out.println("██╔══██║██║░░░░░██║░░░░░  ░░░██║░░░██╔══██║██╔══╝░░");
 System.out.println("██║░░██║███████╗███████╗  ░░░██║░░░██║░░██║███████╗");
 System.out.println("╚═╝░░╚═╝╚══════╝╚══════╝  ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝");

 System.out.println("██████╗░██╗███████╗███████╗██╗░█████╗░██╗░░░██╗██╗░░░░░████████╗");
 System.out.println("██╔══██╗██║██╔════╝██╔════╝██║██╔══██╗██║░░░██║██║░░░░░╚══██╔══╝");
 System.out.println("██║░░██║██║█████╗░░█████╗░░██║██║░░╚═╝██║░░░██║██║░░░░░░░░██║░░░");
 System.out.println("██║░░██║██║██╔══╝░░██╔══╝░░██║██║░░██╗██║░░░██║██║░░░░░░░░██║░░░");
 System.out.println("██████╔╝██║██║░░░░░██║░░░░░██║╚█████╔╝╚██████╔╝███████╗░░░██║░░░");
 System.out.println("╚═════╝░╚═╝╚═╝░░░░░╚═╝░░░░░╚═╝░╚════╝░░╚═════╝░╚══════╝░░░╚═╝░░░");

 System.out.println("██████╗░██╗██████╗░██████╗░██╗░░░░░███████╗░██████╗    █████╗░░█████╗░██████╗░██████╗░███████╗░█████╗░████████╗██╗░░░░░██╗░░░██╗");
 System.out.println("██╔══██╗██║██╔══██╗██╔══██╗██║░░░░░██╔════╝██╔════╝   ██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗╚══██╔══╝██║░░░░░╚██╗░██╔╝");
 System.out.println("██████╔╝██║██║░░██║██║░░██║██║░░░░░█████╗░░╚█████╗    ██║░░╚═╝██║░░██║██████╔╝██████╔╝█████╗░░██║░░╚═╝░░░██║░░░██║░░░░░░╚████╔╝░");
 System.out.println("██╔══██╗██║██║░░██║██║░░██║██║░░░░░██╔══╝░░░╚═══██╗   ██║░░██╗██║░░██║██╔══██╗██╔══██╗██╔══╝░░██║░░██╗░░░██║░░░██║░░░░░░░╚██╔╝░░");
 System.out.println("██║░░██║██║██████╔╝██████╔╝███████╗███████╗██████╔╝    █████╔╝╚█████╔╝██║░░██║██║░░██║███████╗╚█████╔╝░░░██║░░░███████╗░░░██║░░░");
 System.out.println("╚═╝░░╚═╝╚═╝╚═════╝░╚═════╝░╚══════╝╚══════╝╚═════╝    ╚════╝░░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝░╚════╝░░░░╚═╝░░░╚══════╝░░░╚═╝░░░░");

 System.out.println("░██████╗░░█████╗░░█████╗░██████╗░  ░░░░░██╗░█████╗░██████╗░██╗");
 System.out.println("██╔════╝░██╔══██╗██╔══██╗██╔══██╗  ░░░░░██║██╔══██╗██╔══██╗██║");
 System.out.println("██║░░██╗░██║░░██║██║░░██║██║░░██║  ░░░░░██║██║░░██║██████╦╝██║");
 System.out.println("██║░░╚██╗██║░░██║██║░░██║██║░░██║  ██╗░░██║██║░░██║██╔══██╗╚═╝");
 System.out.println("╚██████╔╝╚█████╔╝╚█████╔╝██████╔╝  ╚█████╔╝╚█████╔╝██████╦╝██╗");
 System.out.println("░╚═════╝░░╚════╝░░╚════╝░╚═════╝░  ░╚════╝░░╚════╝░╚═════╝░╚═╝");
        }
        else{
          System.out.println("False! Answer was -> Age  <- :(");
          System.out.println("Start the game from the beginning.");
          System.exit(0); 
        }         
     }
        else{
          System.out.println("Invalid Request!");
          System.out.println("Pls only write (Easy) or (Difficult).");
          System.out.println("Restart the game please.");
          System.exit(0);
        }    
} 
} 