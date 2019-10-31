import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import static java.util.Spliterators.iterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;  
import java.util.List;
import static javax.swing.text.html.HTML.Tag.INPUT;


public class javaapplication2 {

    /**
     *
     * @param num
     */
    
    
    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
        //System.out.println(dp[23]);
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);
       // String name;    
       // name = br.readLine();
       // String []s=name.split(" ");
        //Scanner sc=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      int tc=sc.nextInt();
      String s=sc.next();
      int ans=0;
      for(int i=0;i<tc;i++)
      {
            char c;
          c=s.charAt(i);
          ans=ans^(int)(c);
      }
      if(ans==0)
      {
          System.out.println("Ok");
      }
      else{
      char an=(char) (ans);
      System.out.println(an);}
      
        }
       
    }
   
