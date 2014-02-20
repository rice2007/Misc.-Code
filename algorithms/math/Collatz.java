package algorithms.math;

import java.util.Scanner;

public class Collatz {
    public static void collatz (int n) {
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3 * n + 1);
    }
        
    public static void main(String[] args) {
	Scanner	scan = new Scanner(System.in);
        int n = scan.nextInt();
        collatz(n);
        scan.close();
    }
}

