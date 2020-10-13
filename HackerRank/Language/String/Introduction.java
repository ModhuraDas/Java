#Problem : https://www.hackerrank.com/challenges/java-strings-introduction/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        a += B.length();
        System.out.println(a);
        int b = A.compareTo(B);
        System.out.println(b>0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }
}
