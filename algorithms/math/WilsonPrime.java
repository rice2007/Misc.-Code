package algorithms.math;

public class WilsonPrime {

	public WilsonPrime(int x){}
	
	public static int wilsonFactorial(int n) {
		
		if (n == 1) return 1;
		else return (n*wilsonFactorial(n-1));
	}
	
	public static boolean isPrime(int n) {

		int nFact = Factorial.factorial(n-1);
		int mod = ((nFact + 1) % n);
		return (mod == 0);
	}
}
