package algorithms.math;

import java.util.Scanner;

public class DigitalRoot {
    public static void sumDigits(String integer) {
	if (integer.length() == 1) return;
	int total = 0;
	char[] intArr = integer.toCharArray();
	for (char c : intArr) {
	    total += Character.getNumericValue(c); 
	}
	System.out.println("Digital root of " + integer +
		" is: " + total);
	sumDigits(Integer.toString(total));
    }
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String integer = scan.nextLine();
	sumDigits(integer);
	scan.close();
    }
}
