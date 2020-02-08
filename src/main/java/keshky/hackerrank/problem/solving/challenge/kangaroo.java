package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	int kangaroo1 = 0;
    	int kangaroo2 = 0;
    	for(;(x1<10000 && x2<=10000);x1=kangaroo1,x2=kangaroo2) {
        	kangaroo1 = x1 + v1;
        	kangaroo2 = x2 + v2;      	
        	boolean isYes = kangaroo1==kangaroo2;
        	if(isYes)
        		return "YES";
		}
    	
    	return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
    	kangaroo(0, 3, 4, 2);
    	kangaroo(0, 2, 5, 3);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
