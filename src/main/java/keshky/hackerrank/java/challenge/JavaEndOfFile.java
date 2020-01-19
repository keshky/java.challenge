/*
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 */

package keshky.hackerrank.java.challenge;

import java.io.*;
import java.util.*;

public class JavaEndOfFile {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String temp = "";
        
        while(input.hasNext()) {
            temp = input.nextLine();
            list.add(temp);
            if(temp.contains("end-of-file"))
                break;
        }

        int counter = 0;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(++counter + " " +string);
        }
        
    }

}
