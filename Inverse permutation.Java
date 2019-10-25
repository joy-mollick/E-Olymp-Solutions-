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
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n+1];
        int arr1[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
            arr1[i]=arr[i];
        }
        for(int i=1;i<=n;i++)
        {
            arr1[arr[i]]=i;
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
       }
   }
   
