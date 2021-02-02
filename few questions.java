import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		 String name; 
		 String input; 
		 JOptionPane.showMessageDialog(null, " Hello. Now I'll ask you a few questions. Are you ready? ");
		 name= JOptionPane.showInputDialog(" What is your name? ");
      JOptionPane.showMessageDialog(null, " Nice to meet you "+ name );
     input = JOptionPane.showInputDialog(" Okay "+ name +" how old are you? ");
      JOptionPane.showMessageDialog(null, " That's cool ");
      input = JOptionPane.showInputDialog(" So which basketball team do you support? ");
      JOptionPane.showMessageDialog(null, " Thank you for answering my questions "+ name +" have a nice day.Bye Bye ");

  }
  }