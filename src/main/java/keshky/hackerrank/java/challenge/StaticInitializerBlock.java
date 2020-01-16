/*
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * */
package keshky.hackerrank.java.challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {

    static boolean flag = true;
    static int B,H;
   
    static{
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        input.close();
        if(H<=0 || B<=0) {
            System.out.println(new Exception("Breadth and height must be positive"));
            flag =!flag;
        }            
    }
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}//end of main

}//end of class

