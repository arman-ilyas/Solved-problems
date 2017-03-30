package com.practice.hackerrank;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		double positiveNumber = 0, negativeNumber = 0, zeroNumber = 0;
		double positiveFraction = 0, negativeFraction = 0, zeroFraction = 0;
		for (int i = 0; i < n; i++) {
			if (Math.signum(arr[i]) > 0){
				positiveNumber++;
				}
			else if (Math.signum(arr[i]) < 0){
				negativeNumber++;}
			else{
				zeroNumber++;}
		}
		positiveFraction =  positiveNumber/n;
		negativeFraction =  negativeNumber/n;
		zeroFraction =  zeroNumber/n;

		System.out.println(positiveFraction);
		System.out.println(negativeFraction);
		System.out.println(zeroFraction);

	}
}
