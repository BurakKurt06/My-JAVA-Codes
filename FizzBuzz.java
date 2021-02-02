import java.util.Scanner; 
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);  
int x;
System.out.print("\nPlease choose a number under 50 for the FizzBuzz game:\n");
x = input.nextInt();
while (x <= 50) {
if (x % 3 == 0 && x % 5 == 0) {
    System.out.print("\nFizzBuzz");
} else if (x % 3 == 0) {
    System.out.print("\nFizz");
} else if (x % 5 == 0) {
    System.out.print("\nBuzz");
} else System.out.print("\n" + x);
    x = x + 1;
}
  }
}
