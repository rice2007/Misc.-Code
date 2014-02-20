package algorithms.lang.spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheck {
    
    public void parseLine(String line) {
	
    }

    public static void main(String[] args) throws FileNotFoundException {
	
	Scanner scan = new Scanner(System.in);
	String input = null;
	input = scan.nextLine();
	File file = new File(input);
	Scanner fileScan = new Scanner(file);

    }
    /*
     * TODO Read input
     * TODO Parse input by adding to Hashtable with key value set to x=1.
     * 		on second iteration replace value with map.put(key, map.get(key) + 1).
     */
}
