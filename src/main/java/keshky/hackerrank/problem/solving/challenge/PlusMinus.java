package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

    	double zeroNumbers =0,positiveNumbers=0,negativeNumbers=0;
    	
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				zeroNumbers++;
			else if(arr[i] < 0)
				negativeNumbers++;
			else
				positiveNumbers++;
		}
    	int totalNumbers = arr.length;
    	DecimalFormat df = new DecimalFormat("0.000000");

    	positiveNumbers = (positiveNumbers/totalNumbers);
    	System.out.println(df.format(positiveNumbers));
    	
    	negativeNumbers = (negativeNumbers/totalNumbers);
    	System.out.println(df.format(negativeNumbers));
    	
    	zeroNumbers = (zeroNumbers/totalNumbers);
    	System.out.println(df.format(zeroNumbers));
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	// this next line for debugging the solution
    	//plusMinus(new int[]{-4,3,-9,0,4,1});
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
