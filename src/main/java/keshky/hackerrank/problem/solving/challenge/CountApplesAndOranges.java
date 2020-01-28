package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountApplesAndOranges {

	/*
	 * countApplesAndOranges has the following parameter(s):

		s: integer, starting point of Sam's house location.
		t: integer, ending location of Sam's house location.
		a: integer, location of the Apple tree.
		b: integer, location of the Orange tree.
		apples: integer array, distances at which each apple falls from the tree.
		oranges: integer array, distances at which each orange falls from the tree.
	 */
	
    // Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
	
	    int countApples=0,countOranges=0;
	    
	    for (int i = 0; i < apples.length; i++) {
	        int distanceMoved = a + apples[i];
	        if(distanceMoved >=s && distanceMoved <=t)
	            countApples++;
	    }
	    
	    for (int j = 0; j < oranges.length; j++) {
	        int distanceMoved = b + oranges[j];
	        if(distanceMoved >=s && distanceMoved <=t)
	            countOranges++;
	    }
	    System.out.println(countApples);
	    System.out.println(countOranges);
	}
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }

}
