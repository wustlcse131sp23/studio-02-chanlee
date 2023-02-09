package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSimulations = 0;

		// System.out.println("Simulation day " + totalSimulations);
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting gamble amount?");

		double startAmount = in.nextDouble();
		double temp = startAmount;

		System.out.println("What is your percent chance of winning?");

		double winChance = in.nextDouble();
		winChance = winChance / 100;

		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();

		System.out.println("How many simulations would you be running?");
		int simulations = in.nextInt();

		double gamble;
		int runs = 0;
		int wins = 0;
		int losses = 0;
		int lossesTotal = 0;
		int simLoss = 0;
		double alpha = (1-winChance)/winChance;
		double expectedRuin = 0;

		while (totalSimulations < simulations) {
			
			while (startAmount < winLimit && startAmount > 0) {
				// System.out.println("Amount of $: " + startAmount);
				gamble = Math.random();

				if (gamble < winChance) {
					startAmount++;
					// System.out.println("You won the play! You have $" + startAmount + ".");
					wins++;
				} 
				else {
					startAmount--;
					// System.out.println("You lost the play! You have $" + startAmount + ".");
					losses++;
				}
			runs++;
			}
			
			totalSimulations++;
			if (wins > losses) {
				System.out.println("Simulation " + totalSimulations + ": " + runs + " WIN");
			} 
			else {
				System.out.println("Simualtion " + totalSimulations + ": " + runs + " LOSE");
				simLoss ++;
			}
			/*
			 * if (startAmount == winLimit) System.out.println("You succeed for the day!");
			 * if (startAmount == 0) System.out.println("You've lost all your money!");
			 */
			runs = 0;
			wins = 0;
			losses = 0;
			startAmount = temp;
		} 
		
		if (winChance == 0.5)
		{
			expectedRuin = 1 - (startAmount/winLimit);
		}
		else
		{
			expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/(1-Math.pow(alpha, winLimit));
		}
		
		System.out.println("Losses: " + simLoss + " Simulations: " + totalSimulations);
		System.out.println("Ruin Rate from Simulation: " + ((double)simLoss/(double) totalSimulations) + " Expected Ruin Rate: " + expectedRuin);
		
	}
}