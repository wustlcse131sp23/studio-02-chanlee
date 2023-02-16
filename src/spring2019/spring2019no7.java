package spring2019;

import java.util.Scanner;

public class spring2019no7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many rows and columns?");
		int N = in.nextInt();
		
		boolean[][] A = new boolean[N][N];
		int numTrue = 0; 
		double a = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a = (double)(Math.random());
				boolean b = a < 0.5; 
				A[i][j] = b; 
				System.out.print(A[i][j] + " ");
				if (a < 0.5) {
					numTrue++;
				}
			}
			System.out.println();
		}
		System.out.println("The number of true cells in");
		System.out.println(" the array I just filled is " + numTrue);
		
		// part 2
		
		System.out.println("Which row do you want to examine?");
		int r = in.nextInt();
		boolean found = false; 
		for(int i = 0; i < N; i++) {
			if (A[r-1][i] != found) {
				System.out.println("There is a true value in row " + r);
				break;
			}
			else {
				System.out.println("There are only false values in row " + r);
				break;
			}
		}
		
		// part 3
	}

}
