import javax.swing.JOptionPane;
import java.util.*;

public class Main {

  public static void main(String[] args)
 {
        String answer;
        
          answer = 
          JOptionPane.showInputDialog ( "What do you want advice on? Movie, Book or Tourist Places. *Please pay attention to case sensitive.* " );
//--------------------------------------------------------------------------------------
if (answer.equals("Movie"));
 JOptionPane.showInputDialog( " What kind of movie suggestion do you want? Action, Comedy, Horror, Childeren or Romance. ");

  if(answer.equals("Action"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 action movies:\n1: Mad Max: Fury Road\n2: John Wick\n3: Die Hard");
System.exit(0);

  if(answer.equals("Comedy"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 comedy movies:\n1: Like a Boss\n2: The War With Grandpa\n3: The Peanut Butter Falcon");
System.exit(0);

  if(answer.equals("Horror"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 horror movies:\n1: The Exorcist\n2: His House\n3: Chucky");
System.exit(0);

  if(answer.equals("Children"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 childeren movies:\n1: Toy Story\n2: The Wizard of Oz\n3: Inside  Out");
System.exit(0);

  if(answer.equals("Romance"));
 
JOptionPane.showMessageDialog(null, "Here are the top 3 romance movies:\n1: Carol\n2: Titanic\n3: The Notebook");
System.exit(0);


 //--------------------------------------------------------------------------------------
 if(answer.equals("Book"));
 JOptionPane.showInputDialog( " What kind of book suggestion do you want? Novel, Romance, Horror, Travel, Cooking, History. ");

  if(answer.equals("Novel"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 Novel books:\n1: My Sweet Orange Tree (by José Mauro de Vasconcelos).\n2: The Boy in the Striped Pyjamas (by John Boyne).\n3: The Kite Runner (by Khaled Hosseini).");
System.exit(0);

  if(answer.equals("Horror"));
 JOptionPane.showMessageDialog(null, "Here are the top 3 Horror books:\n1: Red Dragon (by Thomas Harris).\n2: Misery (by Stephen King).\n3: The Picture of Dorian Gray (by Oscar Wilde).");
System.exit(0);

  if(answer.equals("History"));
  if(answer.equals("Romance"));
 JOptionPane.showMessageDialog(null, "Here are the top 2 History and Romance books:\nHistory: Nineteen Eighty-Four (by George Orwell)\nRomance:The Notebook (by Nicholas Sparks)");
 System.exit(0);

  if(answer.equals("Travel"));
  if(answer.equals("Cooking"));
 JOptionPane.showMessageDialog(null, "Here are the top 2 Travel and Cooking books:\nTravel: World Walk (by Steven Newman)\nCooking: Food Around the World: A Cultural Perspective (by Margaret MacWilliams)");
 System.exit(0);
 

 //--------------------------------------------------------------------------------------
 if (answer.equals("Tourist Places"));
 JOptionPane.showInputDialog(" From which area of Tourist Places suggestion do you want? Asia, Europe, Africa, North America, South America ");
System.exit(0);

  if(answer.equals("Asia"));
 JOptionPane.showMessageDialog(null, "Here are the top 5 Asia's Tourist Places:\n1: Maldives \n2: Tokyo\n3: The Great Wall of China\n4: Hong Kong\n5: Singapore");
System.exit(0);

  if(answer.equals("Europe"));
 JOptionPane.showMessageDialog(null, "Here are the top 5 Europe's Tourist Places:\n1: Eiffel Tower, Paris\n2: Big Ben Clock Tower, London\n3: Leaning Tower of Pisa, Rome\n4:  Swiss Alps, Switzerland\n5: Blue Mosque, Istanbul");
System.exit(0);

  if(answer.equals("Africa"));
 JOptionPane.showMessageDialog(null, "Here are the top 5 Africa's Tourist Places:\n1: Cairo\n2: Cape Town\n3: Serengeti National Park\n4:  Tanzania\n5: Madagascar");
System.exit(0);

  if(answer.equals("North America"));
 JOptionPane.showMessageDialog(null, "Here are the top 5 North America's Tourist Places:\n1: Grand Canyon\n2: New York City\n3: Yellowstone National Park\n4:  Niagara Falls\n5: Mexico City");
System.exit(0);

  if(answer.equals("South America"));
 JOptionPane.showMessageDialog(null, "Here are the top 5 South America's Tourist Places:\n1: Rio de Janeiro\n2: Costa Rica\n3: Buenos Aires\n4:  Argentine Patagonia\n5: Cartagena");
 System.exit(0);
}
 }

