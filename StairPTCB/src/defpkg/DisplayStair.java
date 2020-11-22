package defpkg;

import java.util.Scanner;

/**
 * 		Author	: Rezady
 * 		Date	: 22 November 2020
 * 
 * */


public class DisplayStair {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("Please input your number : ");
			int n = input.nextInt();
			displayStair(n);
		}
	}
	
	private static void displayStair(int stairCount) {
		String hash = "#";
		String validateStair = validateStair(stairCount);
		
		if(validateStair == "ok") {
			for(int x=0;x<stairCount;x++) {
				System.out.printf("%"+stairCount+"s\n", hash);
				hash+="#";
			}
		} else if(validateStair == "zero") {
			System.out.println("You put ZERO number. Stairs will not appear");
		}
		else if(validateStair == "nok"){
			System.out.println("Number not validated. Please input number between 0 - 100");
		}
	}
	
	private static String validateStair(int stairCount) {
		int minStair = 0;
		int maxStair = 100;
		
		if(stairCount < minStair || stairCount > maxStair) {
			return "nok";
		} else if(stairCount == 0) {
			return "zero";
		}
		else {
			return "ok";
		}
	}
}
