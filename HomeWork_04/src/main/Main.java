package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** 1 */
		
		String text1 = "I love programming", text2 = "program";
		boolean result = text1.contains(text2);
		System.out.println(" text1:" + result);
		
		/** 2 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Search text:");
		text2 = sc.nextLine();
		boolean result2 = text1.contains(text2);
		System.out.println("text2:" + result2);
		
		/** 3 */
		
		System.out.println("Please give the original text: ");
		String originalText = sc.nextLine();
		System.out.println("Please give the text to search for: ");
		String searchText = sc.nextLine();
		boolean result3 = originalText.contains(searchText);
		System.out.println("text3:" + result3);
		
		/** 4 */
		
		System.out.println("Please give a number from 1 to 10");
		int givenNumb = sc.nextInt();
		Random random = new Random();
		int machNumber = random.nextInt(10) + 1;
		System.out.println("The machine number is:" + machNumber);
		int total = givenNumb + machNumber;
		boolean pair = ((total % 2 == 0) == true);
		boolean unPair = ((total % 2 != 0) == false);
		
		System.out.println("You won " + pair);
		
		/** 5 */
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please give a text: ");
		String userInput = sc2.nextLine();
		int textLenght = userInput.length();
		System.out.println("Please give a number at most that " + textLenght + ": ");
		int userNumb = sc2.nextInt();
		int machNumb2 = random.nextInt(textLenght);
		System.out.println("The machine number is: " + machNumb2);
		int userDiff = Math.abs(textLenght - userNumb);
		int machDiff = Math.abs(textLenght - machNumb2);
		boolean diff = ((userDiff < machDiff) == true);
		System.out.println("You won: " +  diff);
		
		/** 6 */
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Please give the amount of loan");
		int loan = sc3.nextInt();
		System.out.println("Please give the repayable amount");
		int repayAmount = sc3.nextInt();
		System.out.println("Please give the term");
		int term = sc3.nextInt();
		int loanAmount = (repayAmount * term);
		System.out.println("The total amount of loan: " + loanAmount);
		
		/** 7 */
		
		System.out.println("Please give the amount of loan");
		int loan2 = sc3.nextInt();
		System.out.println("Please give the repayable amount");
		int repayAmount2 = sc3.nextInt();
		double profit = 0.15;
		System.out.println("The term is: " + ((loan2 * (1 + profit)) / repayAmount2) / 12);
		
		/** 8 */
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Please type a text:");
		String randText = sc4.nextLine();
		System.out.println("Please estimate the lenght of text");
		int estText = sc4.nextInt();
		int realText = randText.length();
		int estDiff = Math.abs(estText - realText);
		boolean estDiff2 = (estDiff == 0 == true);
		System.out.println("You won: " + estDiff2);
		
		/** 9,10 */
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Please give how many kilometers you want to walk: ");
		double km = sc5.nextDouble();
		System.out.println("Please enter your height");
		int height = sc5.nextInt();
		double step = (height * 0.2) * 100000;
		System.out.println("You need to step: " + step);
		double kcal = step * 0.046;
		System.out.println("The amount of calories burned " + kcal + "kcal: ");
		
		/** 11 */
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		int n1 = sc6.nextInt();
		int n2 = sc6.nextInt();
		int n3 = sc6.nextInt();
		int n4 = sc6.nextInt();
		int n5 = sc6.nextInt();
		int sum = n1 + n2 + n3 + n4 + n5;
		System.out.println("Sum of entered numbers is:"  + sum);
		
		/** 12 */
		
		Scanner sc7 = new Scanner(System.in);
		String myString = sc7.nextLine();
		System.out.println(myString);
		/** A beírt számot szövegként fogja kezelni */
	}
}


