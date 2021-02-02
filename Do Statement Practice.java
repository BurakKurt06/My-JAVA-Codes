import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
		
		char fun;
		do
		{
			System.out.println("Are you having fun yet? (y/n)");
			fun = scan.nextLine().charAt(0);
		}
		while(fun =='n');
		System.out.println("Good, I’m glad.");

  }
}