package pj_NumberGuessing;

import java.util.Scanner;

public class Main {
	// Function that implements the number guessing game
	public static void guessingGame() {
		Scanner sc = new Scanner(System.in);
		
		int max = 10;
		int min = 1;
		int range = max - min +1;
	
		int Num = 0;
		for(int i=min; i<=max; i++) {
			Num = (int) (Math.random() * range) +1; }
	
	for(int i=0; i<=5; i++) {
		System.out.println("Enter first guessing Number:" );
		int lego = sc.nextInt();	
	
		if (lego > Num) {
		System.out.println("The guessed number is higher than the actual number.");
		continue;
		} 
		else if (lego < Num) {
		System.out.println("The guessed number is lower than the actual number.");
		continue;
		} 
		else {
		System.out.println("Strike");
		break;
			}
		}
	System.out.println("Random Number was:" +  Num);
	}
//System.out.println("RandomNumber was: " + Num);
	
	//Driver Code
	public static void main(String[] args) {
		
		guessingGame();
		
		}
	
	}