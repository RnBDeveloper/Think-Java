
/**
 * A program that displays the elements of a given array
 * raised in a given power (inside main, without method) /Check ArrayEx1Ch08
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCh08 {
	public static void main(String[] args) {
		int n, i, p;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the elements of a: ");
		n = in.nextInt();
		double[] a = new double[n];
		double[] b = new double[a.length];

		for (i = 0; i < a.length; i++) {
			System.out.print("Enter the element number " + (i + 1) + " of the array: ");
			a[i] = in.nextDouble();
		}

		System.out.println("\nThis is the array a: ");
		System.out.print(Arrays.toString(a));
		System.out.println("\n");
		System.out.print("Enter the power p: ");
		p = in.nextInt();

		for (i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i], p);
		}

		System.out.println();
		System.out.println("\nThis is the array b, \"a squared\": ");
		System.out.print(Arrays.toString(b));

		in.close();
	}
}
