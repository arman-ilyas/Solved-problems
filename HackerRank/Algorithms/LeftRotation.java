package com.practice.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static int finalIndex(int index, int numberOfLeftRotations, int size) {
		int newIndex = 0;
		// digit's rotation causes it to make round the loop
		if (index - numberOfLeftRotations < 0) {
			return newIndex = size + index - (numberOfLeftRotations % size);
		}
		// digit doesn't "overflow" from the array
		newIndex = index - numberOfLeftRotations;
		return newIndex;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int numberOfLeftRotations = in.nextInt();
		int array[] = new int[n];
		// initialize the array with correct position
		for (int i = 0; i < n; i++) {
			int newIndex = finalIndex(i, numberOfLeftRotations, n);
			array[newIndex] = in.nextInt();
		}
		in.close();
		//System.out.println(Arrays.toString(array));
		  for(int i=0;i<n;i++){
	           System.out.print(array[i]+" ");
	        }
	}
}
