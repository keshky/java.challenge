package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMax {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	Arrays.sort(arr);
    	Long mini = 0L;
    	Long max = 0L;
    	for (int i = 0; i < arr.length-1; i++) {
			mini += arr[i];
		}
    	
    	for (int i = 1; i < arr.length; i++) {
			max += arr[i];
		}
    	
    	System.out.println(mini + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
