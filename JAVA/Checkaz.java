//package Question2;
import java.io.*;
import java.util.Scanner;
public class Checkaz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String test1="The quick brown fox jumps over the lazy dog.";
//		String test1="Hello World";
		
		System.out.println("Enter Your sentence to check for pangram");

		Scanner sc= new Scanner(System.in);

		String test1=sc.nextLine();
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		
		
		// convert the given input sentence to the lower case 
		String lower=test1.toLowerCase();
		boolean flag=true;
		for(int i=0;i<26;i++ ) {
			String c=""+alphabet.charAt(i);
			if(!lower.contains(c)) {
				flag=false;
				break;
			}
			
		}
		if(flag) System.out.println("Pangram Sentence");
		else System.out.println("Not a pangram sentence");
		sc.close();
	}

}
