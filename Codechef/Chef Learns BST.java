/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
		    int T=sc.nextInt();
		    while(T-->0){
		    int N=sc.nextInt();
		    int[] arr=new int[N];
		    for(int i=0;i<N;i++){
		        arr[i]=sc.nextInt();
		    }
		    Set<Integer> s=new HashSet<>();
		    for(int i:arr){
		       s.add(i); 
		    }
		    if(s.size()==N){
		        System.out.println("Yes");
		        
		    }
		    else{
		        System.out.println("No");
		    }
		    }
		}
	}
}
