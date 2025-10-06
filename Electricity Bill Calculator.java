import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int tu,amt;
        Scanner sc = new Scanner(System.in);
        tu= sc.nextInt();
        if(tu<100){
           amt=tu*5;
        }
        else if (tu<200){
           amt=(100*5)+(tu-100)*7;
         }
        else{
          amt=(100*5)+(100*7)+(tu-200)*10;
         }
        System.out.println(amt);
    }
}
