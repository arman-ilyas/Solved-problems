package com.practice.hackerrank;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day8of30dayCodeChallenge {
	static int factorial(int n) {
		if (n == 0 || n==1)
			return 1;
		else {
				return n* factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(factorial(t));

	}
}
