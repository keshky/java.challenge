package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	
    	String[] timeParts = s.split(":");
    	
    	int hours,minutes,seconds=0;
    	hours = Integer.parseInt(timeParts[0]);
    	minutes = Integer.parseInt(timeParts[1]);
    	seconds = Integer.parseInt(timeParts[2].substring(0,2));
    	char morningOrNight = timeParts[2].substring(2,4).charAt(0);
    	
    	StringBuilder result = new StringBuilder();
    	
    	//hours part
    	if(morningOrNight == 'A' && hours ==12)
    		hours = 00;
    	
    	if(morningOrNight == 'P' && hours <12)
    		hours = hours + 12;
    	
    	if(hours <10)
			result.append("0").append(hours);
		else
			result.append(hours);
    	
    	// adding separator ":"
    	result.append(":");
    	 
    	 //minutes part
		if(minutes <10)
			result.append("0").append(minutes);
			else
				result.append(minutes);
		
    	// adding separator ":"
		result.append(":");
		
		//seconds part
		if(seconds <10)
			result.append("0").append(seconds);
			else
				result.append(seconds);
		
    	return result.toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	System.out.println(timeConversion("01:00:00PM"));
    	System.exit(1);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
