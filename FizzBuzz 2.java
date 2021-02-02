public class Main {
public static void main(String[] args) {
int x = 1;
while (x <= 50) {
    if (x % 3 == 0 && x % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (x % 3 == 0) {
        System.out.println("Fizz");
    } else if (x % 5 == 0) {
        System.out.println("Buzz");
    } else System.out.println(x);
    x = x + 1;
}
  }
}