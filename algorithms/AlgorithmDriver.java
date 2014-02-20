package algorithms;

import java.util.Scanner;

import algorithms.lang.*;
import algorithms.math.*;
import algorithms.searchsort.BubbleSort;

public class AlgorithmDriver<T> extends BubbleSort<T> {
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String input;
	
		while (run) {
			
			input = scan.nextLine().toLowerCase();
			switch(input) {
			
			case PANGRAM: System.out.println(Pangrams.pangramParser());
			break;
			case WILSON_PRIME:
				System.out.println("Enter a natural number.");
				x = scan.nextInt();
				System.out.println(WilsonPrime.isPrime(x));
			break;
			case CLOSE: run = false;
			break;
			}
		}
	scan.close();
}

	public static Scanner scan = new Scanner(System.in);
	private static boolean run = true;
	private static int x;
	private final static String PANGRAM = ("pangram");
	private final static String WILSON_PRIME = ("wilson prime");
	private final static String CLOSE = ("close");
}
