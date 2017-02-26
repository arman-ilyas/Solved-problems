package com.practice.hackerrank;

import java.util.Scanner;

public class ArraysDS {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int array[]=new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			array[a0]=in.nextInt();
			}
		for(int i=n-1;i>=0;i--){
			System.out.print(array[i]+" ");
		}
    }
}
