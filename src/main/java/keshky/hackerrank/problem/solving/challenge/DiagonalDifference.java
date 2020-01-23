package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int temp1 = 0;
    	for (Integer i = 0; i < arr.size(); i++) {
    		List<Integer> childList = arr.get(i);
			for (Integer j = i; j <= i; j++) {
				Integer value = childList.get(j);
				temp1+= value;
			}
		}
    	
    	int temp2 = 0;
    	for (Integer i = 0; i <arr.size(); i++) {
    		List<Integer> childList = arr.get(i);
			for (Integer j = childList.size()-1-i; j > childList.size()-2-i; j--) {
				Integer value = childList.get(j);
				temp2+= value;
			}
		}
    	
    	int result = Math.abs(temp1 - temp2);
    	
    	return result;

    }

}

public class DiagonalDifference {

	public static void main(String[] args) throws IOException {
		List<List<Integer>> parentList = new ArrayList();
		List<Integer> childList1 = new ArrayList<>();
		List<Integer> childList2 = new ArrayList<>();
		List<Integer> childList3 = new ArrayList<>();
		
		childList1.add(11);
		childList1.add(2);
		childList1.add(4);
		
		parentList.add(childList1);
		
		childList2.add(4);
		childList2.add(5);
		childList2.add(6);
		
		parentList.add(childList2);
		childList3.add(10);
		childList3.add(8);
		childList3.add(-12);
		
		parentList.add(childList3);
		
		
		
		
		
		int r = Result.diagonalDifference(parentList);
		System.out.println(r);
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
