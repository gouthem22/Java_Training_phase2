import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        int a=sc.nextInt();
        if(a>=1 && a<=11){
            if(b=='A')System.out.println(25);
            else if(b=='B') System.out.println(20);
             else if(b=='C') System.out.println(15);
        }
         else{
             if(b=='A')System.out.println(30);
            else if(b=='B') System.out.println(25);
             else if(b=='C') System.out.println(20);
         }
    }
}
