/*
 * https://www.hackerrank.com/challenges/java-loops/problem
 */

package keshky.hackerrank.java.challenge;

import java.util.*;
import java.io.*;

public class JavaLoops2 {

public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            JavaLoops2.solveEquation(a,b,n);
        }
        in.close();
    }
    static void solveEquation(int a,int b,int n) {
        double [] result = new double[n];
        result[0] = a + b;
        for (int i = 1; i < n; i++) {
            double newB = b * Math.pow(2, i);
            result[i] = result[i-1] + newB;
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < result.length; i++) {           
            sb.append((int) result[i]);    
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

}
