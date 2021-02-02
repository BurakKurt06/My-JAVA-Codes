import javax.swing.JOptionPane; 
public class Main {
	  public static void main(String [] args) {

// QUESTION #1
String input;
int answer;
boolean guess;
		
JOptionPane.showMessageDialog(null, "Welcome to our Guessing Game!");
input = JOptionPane.showInputDialog("Question #1 \nHow many copies of Harry Potter have been sold worldwide in the millions?\n a) 50   b)100    c) 500");
answer = Integer.parseInt(input);
guess = (answer == 500);   
JOptionPane.showMessageDialog(null, guess + "! The answer is 500.");
	
// QUESTION #2           
input = JOptionPane.showInputDialog(null, "Question #2 \nHow many professional basketball teams are there in the United States?");
answer = Integer.parseInt(input);
guess = (answer == 30);	      
JOptionPane.showMessageDialog(null, guess +"!  The answer is 30.");

// QUESTION #3
   input= JOptionPane.showInputDialog("Question #3 \nHow many Walmart's are there in NJ? " + "\n a) 60   b)70    c) 80");
   answer= Integer.parseInt(input);
   guess= (answer==70);
   JOptionPane.showMessageDialog(null, guess +"! The answer is 70.");

// QUESTION #4
  input= JOptionPane.showInputDialog("Question #4 \nWhat is the High School South's mascot? " + "\n a) Ravens(1)    b)Leopards(2)    c) Pirates(3) \nPlease enter '1' for Ravens, enter '2' for Leopards, enter '3' for Pirates");
  answer= Integer.parseInt(input);
  guess= (answer==3);
  JOptionPane.showMessageDialog(null, guess +"! The answer is Pirates.️ ▁ ▂ ▅ ▆ ▇ ★PIRATES★ ▇ ▆ ▅ ▂ ▁ ");

  // QUESTION #5
		input= JOptionPane.showInputDialog("Question #5 \nOur class has 2 teachers, 14 boys and 11 girls. How many people are there in the class?");
		answer= Integer.parseInt(input);
		guess= (answer==27);
		JOptionPane.showMessageDialog(null, guess +"! The answer is 27");

    JOptionPane.showMessageDialog(null, "Guessing Game is finished. Goodbye.");
  }
}