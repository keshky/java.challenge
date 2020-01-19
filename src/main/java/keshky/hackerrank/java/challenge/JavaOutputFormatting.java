/*
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 */

package keshky.hackerrank.java.challenge;

import java.util.Scanner;

public class JavaOutputFormatting {

   public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);
            if(x<10)
                System.out.printf("00%d\n",x);
            else if(x<100)
                System.out.printf("0%d\n",x);
            else
                System.out.printf("%d\n",x);
        }
        System.out.println("================================");    
    }
}
