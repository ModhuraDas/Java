#Problem : https://www.hackerrank.com/challenges/java-string-reverse/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT.*/ 
        StringBuilder str = new StringBuilder(A);
        String ab = new String(str);
        String a = new String(str.reverse());
        int b = a.compareTo(ab);
        System.out.println(b==0 ? "Yes" : "No");
    }
}
