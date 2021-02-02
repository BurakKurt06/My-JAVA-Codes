import javax.swing.JOptionPane;
// Header:
// Name:Burak Kurt
// Project name: Math Practice
// Date:11/7/2020
//--------
// PIPO ;
// PURPOSE - Calculate the given challenges correctly. 
// INPUTt - SurveyRespondents, MultipleDrinkers, CitrusDrinkers, pressure, force, area, distance, speed, time, base, height, area2 
// PROCESS - Calculating challenges
// OUTPUT - MultipleDrinkers, CitrusDrinkers, pressure, distance, area
class Main {
  public static void main(String[] args) {
    // The second version is at the bottom.
     String input, area3;
    double SurveyRespondents, MultipleDrinkers, CitrusDrinkers, pressure, force, area, distance, speed, time, base, height, area2;

    JOptionPane.showMessageDialog(null, " WELCOME TO BURAK'S MATH PRACTICE ASSIGNMENT! ");
//=====================================================================================
    JOptionPane.showMessageDialog(null, " Challenge 1, Energy Drink Consumption: ");

		 input = JOptionPane.showInputDialog(" How many people took part in the survey?");
		 SurveyRespondents = Double.parseDouble(input);

		 input= JOptionPane.showInputDialog(" How many percent of attendees get one or more energy drinks per week? ");
		 MultipleDrinkers = Double.parseDouble(input);
     MultipleDrinkers = ((SurveyRespondents * MultipleDrinkers) / 100);
     
     input= JOptionPane.showInputDialog(" How many percent of attendees prefer citrus-flavored energy drinks? ");
		 CitrusDrinkers = Double.parseDouble(input);
     CitrusDrinkers = ((MultipleDrinkers * CitrusDrinkers) / 100);

		 JOptionPane.showMessageDialog(null, "SURVEY RESULTS:\nSurvey Respondents: "+ SurveyRespondents +" people,\nMultiple Drinkers: "+ MultipleDrinkers +" people,\nCitrus Drinkers: "+ CitrusDrinkers +" people,\nThank you for using our calculator.");
//=====================================================================================
     JOptionPane.showMessageDialog(null, " Challenge 2, Calculate Pressure: ");

		 input = JOptionPane.showInputDialog(" How much is force?");
		 force = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How big is the area?");
		 area = Double.parseDouble(input);
     
     pressure =  (force / area);

		 JOptionPane.showMessageDialog(null, "PRESSURE CALCULATOR:\nFORCE: "+ force +"\nAREA: "+ area +"\nPRESSURE: "+ pressure +"\nThank you for using our calculator."); 
//=====================================================================================     
     JOptionPane.showMessageDialog(null, " Challenge 3, Calculate Speed: ");

		 input = JOptionPane.showInputDialog(" How much is speed?");
		 speed = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How much is time?");
		 time = Double.parseDouble(input);
     
     distance =  (speed * time);

		 JOptionPane.showMessageDialog(null, "DISTANCE CALCULATOR:\nSPEED: "+ speed +"\nTIME: "+ time +"\nDISTANCE: "+ distance +"\nThank you for using our calculator.");
//=====================================================================================
     JOptionPane.showMessageDialog(null, " Challenge 4, Area of a Triangle: "); 

		 input = JOptionPane.showInputDialog(" How big is the base?");
		 base = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How high is height?");
		 height = Double.parseDouble(input);
     
     area2 =  ((base * height) / 2);
     area3 = String.format("%.2f", area2);

		 JOptionPane.showMessageDialog(null, "AREA OF TRIANGLE CALCULATOR:\nBASE: "+ base +"\nHEIGHT: "+ height +"\nAREA: "+ area3 +"\nThank you for using our calculator.");
          //=====================================================================================
     JOptionPane.showMessageDialog(null, "ANSWERS OF ALL THE QUESTIONS:\n===============\nChallenge 1:\nSurvey Respondents: "+ SurveyRespondents +" people,\nMultiple Drinkers: "+ MultipleDrinkers +" people,\nCitrus Drinkers: "+ CitrusDrinkers +" people.\n===============\nChallenge 2:\nFORCE: "+ force +"\nAREA: "+ area +"\nPRESSURE: "+ pressure +"\n===============\nChallenge 3:\nSPEED: "+ speed +"\nTIME: "+ time +"\nDISTANCE: "+ distance +"\n===============\nChallenge 4:\nBASE: "+ base +"\nHEIGHT: "+ height +"\nAREA: "+ area2 +"\nTHANK YOU FOR CHOOSING OUR CALCULATOR."); 

     //=========================================================================================
     // VERSION 2
     //=========================================================================================
     // CHALLENGE 1
     /* String input;
		 double SurveyRespondents, MultipleDrinkers, CitrusDrinkers;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate the survey results! ");

		 input = JOptionPane.showInputDialog(" How many people took part in the survey? ");
		 SurveyRespondents = Double.parseDouble(input);

		 input= JOptionPane.showInputDialog(" How many percent of attendees get one or more energy drinks per week? ");
		 MultipleDrinkers = Double.parseDouble(input);
     MultipleDrinkers = ((SurveyRespondents * MultipleDrinkers) / 100);
     
     input= JOptionPane.showInputDialog(" How many percent of attendees prefer citrus-flavored energy drinks? ");
		 CitrusDrinkers = Double.parseDouble(input);
     CitrusDrinkers = ((MultipleDrinkers * CitrusDrinkers) / 100);

		 JOptionPane.showMessageDialog(null, " SURVEY RESULTS:\nSurvey Respondents: "+ SurveyRespondents +" people,\n Multiple Drinkers: "+ MultipleDrinkers +" people,\nCitrus Drinkers: "+ CitrusDrinkers +" people,\nThank you for attend the our survey."); */

   //=========================================================================================
   
     // CHALLENGE 2
    /* String input;
		 double pressure, force, area;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate the pressure! ");

		 input = JOptionPane.showInputDialog(" How much is force? ");
		 force = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How big is the area? ");
		 area = Double.parseDouble(input);
     
     pressure =  (force / area);

		 JOptionPane.showMessageDialog(null, " PRESSURE CALCULATOR:\nFORCE: "+ force +"\n AREA: "+ area +"\nPRESSURE: "+ pressure +"\nThank you for using our calculator."); */

     //CHALLENGE 3
     /*String input;
     double distance, speed, time;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate the distance! ");

		 input = JOptionPane.showInputDialog(" How much is speed? ");
		 speed = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How much is time? ");
		 time = Double.parseDouble(input);
     
     distance =  (speed * time);

		 JOptionPane.showMessageDialog(null, " DISTANCE CALCULATOR:\nSPEED: "+ speed +"\nTIME: "+ time +"\nDISTANCE: "+ distance +"\nThank you for using our calculator."); */

     //CHALLENGE 4
     /* String input, AREA;
     double base, height, area;

		 JOptionPane.showMessageDialog(null, " Hello, Let's calculate the area of triangle! ");

		 input = JOptionPane.showInputDialog(" How big is the base? ");
		 base = Double.parseDouble(input);

     input = JOptionPane.showInputDialog(" How high is height? ");
		 height = Double.parseDouble(input);
     
     area =  ((base * height) / 2);
     AREA = String.format("%.2f", area);

		 JOptionPane.showMessageDialog(null, " AREA OF TRIANGLE CALCULATOR:\nBASE: "+ base +"\nHEIGHT: "+ height +"\nAREA: "+ AREA +"\nThank you for using our calculator."); */
  }
}