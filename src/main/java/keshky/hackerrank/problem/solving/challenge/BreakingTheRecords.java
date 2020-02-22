package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int min=scores[0],max=scores[0];
    	int countMin=0,countMax=0;

    	for (int i = 1; i < scores.length; i++) {
			if(scores[i]<min) {
				min = scores[i];
				countMin++;
			}
			if(scores[i]>max) {
				max = scores[i];
				countMax++;
			}
		}

    	return new int[] {countMax,countMin};
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
//    	breakingRecords(new int[] {0,0,0,0,0});
    	breakingRecords(new int[] {3,4,21,36,10,28,35,5,24,42});
//    	breakingRecords(new int[] {10,5,20,20,4,5,2,25,1});
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
