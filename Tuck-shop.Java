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
        int a,b;
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
        String name;    
        name = br.readLine();
        String []s=name.split(" ");;
        //Scanner sc=new Scanner(System.in);
       long arr[]=new long[3];
       arr[0]=Long.parseLong(s[0]);
       arr[1]=Long.parseLong(s[1]);
       arr[2]=Long.parseLong(s[2]);
        System.out.println(arr[0]+arr[1]+arr[2]);
       }
   }
