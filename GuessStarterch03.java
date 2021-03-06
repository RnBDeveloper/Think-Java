import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarterch03 {
	public static void main(String[] args) {
		int number, guess;
		Random r = new Random(); // You're gonna pick a random number.
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? ");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		while (guess > 100) {
			System.out.print("The number should be between 1 & 100: ");
			guess = in.nextInt();
		}
		System.out.println("Your guess is: " + guess);
		System.out.print("The number I was thinking of is: ");
		number = r.nextInt(100) + 1;
		System.out.print(number);
		if (guess > number) {
			System.out.print("\nYour guess were off by: ");
			System.out.print(guess - number);
		} else {
			System.out.print("\nYour guess were off by: ");
			System.out.print(number - guess);
		}
		in.close();
	}
}
