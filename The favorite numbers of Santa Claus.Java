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
    static boolean ok(int n)
    {
        int prev=-1;
        while(n>0)
        {
            if(n%10==1&&prev==3)
            {
                return false;
            }
            prev=n%10;
            n=n/10;
        }
        return true;
    }
    
    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
          int mx=500001;
     boolean prim[]=new boolean[mx];
     int dp[]=new int[mx];
     for(int i=0;i<mx;i++) {
         prim[i]=true;
         dp[i]=0;
     }
     boolean no_thirty[]=new boolean[mx];
     for(int i=0;i<mx;i++)
     {
         if(ok(i)==true)
         {
             no_thirty[i]=true;
         }
     }
        int a,b;
        prim[1]=false;
        for(int i=2;i<mx;i++)
        {
            if(prim[i]==true)
            {
                for(int j=i*2;j<mx;j=j+i)
                {
                    prim[j]=false;
                }
            }
        }
        int sum=0;
        dp[0]=0;
        for(int i=1;i<mx;i++)
        {
            if(prim[i]==true)
            {
                if(no_thirty[i]==true){
                sum++;}
            }
            dp[i]=sum;
        }
        //System.out.println(dp[23]);
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
        String name;    
        name = br.readLine();
        String []s=name.split(" ");
        //Scanner sc=new Scanner(System.in);
       int arr[]=new  int[2];
       arr[0]=Integer.parseInt(s[0]);
       arr[1]=Integer.parseInt(s[1]);
       int res=dp[arr[1]]-dp[arr[0]-1];
       System.out.println(res);
    }
   }
