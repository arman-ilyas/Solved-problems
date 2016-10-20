package com.practice.topcoder;

public class TurretDefense {

	public int firstMiss(int[] xs, int[] ys, int[] times) {
		int xCurrent = 0, yCurrent = 0, targetNumber = 0, distance = 0, lastKnownTime = 0;
		for (int i = 0; i < times.length; i++) {
			distance = Math.abs(xs[i] - xCurrent) + Math.abs(ys[i] - yCurrent) + lastKnownTime;
			if (distance <= times[i]) {
				xCurrent = xs[i];
				yCurrent = ys[i];
				lastKnownTime = times[i];
			} else {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TurretDefense tf = new TurretDefense();
		int xs[] = { 1, 2, 3, 4, 15 };
		int ys[] = { 1, 2, 3, 4, 15 };
		int times[] = { 100, 200, 300, 400, 405 };
		System.out.println(tf.firstMiss(xs, ys, times));

	}

}
