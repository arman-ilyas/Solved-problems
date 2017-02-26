package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// extremly dirty code, but my knowledge is limited just yet so this is the quick solution
public class twoDArrayDS {
	static int highestHourglassSum(int[][] array) {
		int highestSum = array[0][0] + array[0][1] + array[0][2] + array[1][1] + array[2][0] + array[2][1]
				+ array[2][2];
		int highestSumTemp = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				highestSumTemp = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
						+ array[i + 2][j + 1] + array[i + 2][j + 2];
				if (highestSumTemp > highestSum) {
					highestSum = highestSumTemp;
				}
			}
		}
		return highestSum;
	}

	public static void main(String[] args) {
		// read 2d array
		int gridSize = 6;
		int[][] myArray = new int[gridSize][gridSize];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < gridSize; i++) {
			for (int j = 0; j < gridSize; j++) {
				myArray[i][j] = sc.nextInt();
			}
		}
		System.out.println(highestHourglassSum(myArray));
		// System.out.println(Arrays.deepToString(myArray));
	}

}
