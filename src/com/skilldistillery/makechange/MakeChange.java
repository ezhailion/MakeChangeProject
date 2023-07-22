package com.skilldistillery.makechange;

import java.util.Scanner;

/* 
 *In the cash register we will calculate the amount of change returned 
 *to a customer based on the purchase price and the amount tendered. 
 *We will also notify the attendant how many of each type of currency 
 *($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change f
 *or the customer.

Change will be provided using a combination of the largest bill 
and coin denominations as possible.

Denominations that are not used will not be displayed.
 */
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the total for the price of your item being purchased: ");
		double total = kb.nextDouble();
		System.out.println("How much money was tendered? ");
		double tendered = kb.nextDouble();
		int change = (int) ((tendered - total) * 100);
		double change1 = change;
		if (change < 0) {
			System.out.printf("Sorry! You still owe  $%,.2f%n", (total - tendered));
		}
		if (change == 0) {
			System.out.println("Thank you for the exact change! There is no change owed.");
		}
		if (change > 0) {
			System.out.printf("Your total change is $%,.2f%n", (change1 / 100));
			makeChange(change);
		}

		kb.close();
	}

	public static int makeChange(int makeChange) {
		int change = makeChange;

		/*
		 * if (change >= 20) { int twenties = change / 2000; change = change % 2000; if
		 * (twenties != 0) { System.out.println(twenties + " Twenties"); } }
		 * 
		 * 
		 * if (change >= 10) { int tens = change / 1000; change = change % 1000;
		 * System.out.println(tens + " Tens"); }
		 * 
		 * 
		 * if (change >= 5) { int fives = change / 500; change = change % 500; if (fives
		 * != 0) { System.out.println(fives + " Fives"); } }
		 * 
		 * if (change >= 1) { int ones = change / 100; change = change % 100; if (ones
		 * != 0) { System.out.println(ones + " Ones"); } }
		 * 
		 * if (change >= 0.25) { int quarters = change / 25; change = change % 25; if
		 * (quarters != 0) { System.out.println(quarters + " Quarters"); } }
		 * 
		 * 
		 * if (change >= 0.1) { int dimes = change / 10; change = change % 10; if (dimes
		 * != 0) { System.out.println(dimes + " Dimes"); } }
		 * 
		 * if (change >= 0.05) { int nickel = change / 5; change = change % 5; if
		 * (nickel != 0) { System.out.println(nickel + " Nickels"); }
		 * 
		 * }
		 * 
		 * 
		 * if (change >= 0.01) { int pennies = change / 1; change = change % 1; if
		 * (pennies != 0) { System.out.println(pennies + " Pennies"); }
		 * 
		 * }
		 */
		change = makeTwenties(change);

		change = makeTens(change);

		change = makeFives(change);

		change = makeOnes(change);

		change = makeQuarters(change);

		change = makeDimes(change);

		change = makeNickels(change);

		change = makePennies(change);

		return change;
	}

	public static int makeTwenties(int Twenties) {
		int change = Twenties;
		if (change >= 20) {
			int twenties = change / 2000;
			change = change % 2000;
			if (twenties != 0) {
				System.out.println(twenties + " Twenties");
			}
		}

		return change;
	}

	public static int makeTens(int Tens) {
		int change = Tens;
		if (change >= 10) {
			int tens = change / 1000;
			change = change % 1000;
			if (tens != 0) {
				System.out.println(tens + " Tens");
			}
		}
		return change;
	}

	public static int makeFives(int Fives) {
		int change = Fives;
		if (change >= 5) {
			int fives = change / 500;
			change = change % 500;
			if (fives != 0) {
				System.out.println(fives + " Fives");
			}
		}
		return change;
	}

	public static int makeOnes(int Ones) {
		int change = Ones;
		if (change >= 1) {
			int ones = change / 100;
			change = change % 100;
			if (ones != 0) {
				System.out.println(ones + " Ones");
			}
		}
		return change;
	}

	public static int makeQuarters(int Quarters) {
		int change = Quarters;
		if (change >= 0.25) {
			int quarters = change / 25;
			change = change % 25;
			if (quarters != 0) {
				System.out.println(quarters + " Quarters");
			}
		}
		return change;
	}

	public static int makeDimes(int Dimes) {
		int change = Dimes;
		if (change >= 0.1) {
			int dimes = change / 10;
			change = change % 10;
			if (dimes != 0) {
				System.out.println(dimes + " Dimes");
			}
		}
		return change;
	}

	public static int makeNickels(int Nickels) {
		int change = Nickels;
		if (change >= 0.05) {
			int nickel = change / 5;
			change = change % 5;
			if (nickel != 0) {
				System.out.println(nickel + " Nickels");
			}

		}
		return change;
	}

	public static int makePennies(int Pennies) {
		int change = Pennies;
		if (change >= 0.01) {
			int pennies = change / 1;
			change = change % 1;
			if (pennies != 0) {
				System.out.println(pennies + " Pennies");
			}

		}
		return change;
	}

}
