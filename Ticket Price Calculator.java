import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        
            if( b.equals("sunday")|| b.equals("saturday")){
                if(a<12) System.out.println(80);  
                else if(a>=12 && a<=59) System.out.println(120);
                 else if(a>60) System.out.println(70);
        }
        else{
           if(a<12) System.out.println(100);  
                else if(a>=12 && a<=59) System.out.println(150);
                 else if(a>60) System.out.println(90);
        }
    }
}
