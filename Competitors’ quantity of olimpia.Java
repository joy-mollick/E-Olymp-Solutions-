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
        String name;    
        name = br.readLine();
        String []s=name.split(" ");
        //Scanner sc=new Scanner(System.in);
       long k,n,m,d;
       k=Long.parseLong(s[0]);
       n=Long.parseLong(s[1]);
        m=Long.parseLong(s[2]);
         d=Long.parseLong(s[3]);
       Long up=(d*k*n*m);
       Long down=(k*n*m-n*m-k*m-k*n);
       if(up%down==0) System.out.println(up/down);
       else System.out.println("-1");
    }
   }
   
