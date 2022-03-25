import java.io.*;
import java.util.*;

public class day34_java_hast_map {

    public static void main(String[] args)
     {
         Scanner in = new Scanner (System.in);
         int n=in.nextInt();
         in.nextLine();
         HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
         for(int i=0;i<n;i++)
         {
             String name=in.nextLine();//key
             int phone=in.nextInt();//volue
             phonebook.put(name,phone);
             in.nextLine();
         }
        while(in.hasNext())//while NOT EOF
      {
         
          String s=in.nextLine();//s = key = kunci yang dicari = nama yang dicari
          if(phonebook.containsKey(s)){
              System.out.println(s+"="+phonebook.get(s));
        }else{
            System.out.println("NOT found");
       
        }
         
         
      }  
    }
}