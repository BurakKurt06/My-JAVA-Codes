import java.util.Scanner;
public class Main{ 
public static void main(String[] args) { 

  double avg=0, num=0, sum=0;
  int total=0;
Scanner scan = new Scanner(System.in); 

do
{
  System.out.println("Enter a number:");
  num = scan.nextDouble();
if (num >= 0) {
  total++;
  sum += num;
  avg = sum/total;
  System.out.println("The current average is:" + avg);
 }
}
while (num >= 0);
 System.out.println("The final average is:" + avg);
  }
}