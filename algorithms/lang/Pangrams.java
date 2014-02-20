package algorithms.lang;

import java.util.HashSet;

import algorithms.AlgorithmDriver;

public class Pangrams {
	
	public static boolean pangramParser() {
		
		System.out.println("Enter pangram:");
		String s = AlgorithmDriver.scan.nextLine();
		HashSet<Character> alpha = new HashSet<Character>();
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); ++i) {
			if (Character.toString(s.charAt(i)).matches("[a-z]"))
				alpha.add(s.charAt(i));
		}
        return (alpha.size() == 26);
	}
}
