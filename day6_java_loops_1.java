import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class day6_java_loops_1 {
 public static void main(String[]args){
     
     Scanner in = new Scanner(System.in);
     int N = in.nextInt();
    for(int i = 1; i <=10; i++)
    {
         int result= N*i;
         System.out.printf("%d x %d = %d\n",N,i,result);
    }
     
 }  
}
    