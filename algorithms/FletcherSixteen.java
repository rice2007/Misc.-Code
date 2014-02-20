package algorithms;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FletcherSixteen {
    public static String checksum(char[] input) {
	long sumOne = 0;
	long sumTwo = 0;
	long result = 0;
	
	for (char c : input) {
	    sumOne = (sumOne + c) % 255;
	    sumTwo = (sumTwo + sumOne) % 255 ;
	}
	result = (sumTwo << 8 | sumOne);
	return Long.toHexString(result);
    }
    
    public static void main(String[] args) throws IOException {
	System.out.println("Input number of strings:");
	Scanner scan = new Scanner(System.in);
	int i = Integer.parseInt(scan.nextLine());
	int j = 0;
	char[] inputArr;
	
	while (!(j == i)) {
	    j++;
	    System.out.println("Data: ");
	    input = scan.nextLine(); //fix this like bullshit
/*	    inputTemp = scan.nextLine();
	    while (!inputTemp.isEmpty()) {
		input += (" " + inputTemp);
		inputTemp = scan.next();
	    }
/*		System.out.print(scan.hasNextLine());
		input = (input + " " + scan.nextLine());}*/
	    inputArr = cleanInput(input);
	    input = checksum(inputArr);
	    System.out.println("Output: " + j + ": " + input.toUpperCase());
	}
	scan.close();
    }
    
    private static char[] cleanInput(String input) { //ASCII test. failing.
	String[] inputArr = input.split("\\s+");
	for (int i = 0; i < inputArr.length; ++i) {
	    if (inputArr[i].matches("^[\u0000-\u007F]")) {
        	    int j = input.indexOf(inputArr[i]);
        	    String temp = input.substring(j, inputArr[i].length() - 1);
        	    input.replace(temp, "");
	    }
	}
	System.out.println(input);
	return input.toCharArray();
    }
    private static String input;
    private static String inputTemp;
}