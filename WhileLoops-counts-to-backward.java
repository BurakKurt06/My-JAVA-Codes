import java.util.Scanner;
public class Main{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Number: " );
		int n = keyboard.nextInt();
		while ( 0 < n )
		{System.out.println((n-1));
			n--;}

	}
}