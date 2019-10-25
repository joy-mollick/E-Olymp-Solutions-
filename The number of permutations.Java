/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;



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
import static javax.swing.text.html.HTML.Tag.INPUT;


public class javaapplication2 {

    /**
     *
     * @param num
     */
    public static long fact(long n)
    {
        long val=1;
        for(long i=1;i<=n;i++)
        {
            val=(val*i);
        }
        return val;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        long ans=fact(n);
        System.out.println(ans);
       }
       
   }
   

      



     
    

