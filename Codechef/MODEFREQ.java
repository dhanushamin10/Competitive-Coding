/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner((System.in));
         if(sc.hasNextInt())
   {
       
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();

            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> arrFreq=new HashMap<>();
            for(int i:arr){
                if(!arrFreq.containsKey(i)){
                    arrFreq.put(i,1);
                }
                else{
                    arrFreq.put(i,arrFreq.get(i)+1);
                }
            }
            HashMap<Integer,Integer> modeFreq=new HashMap<>();
            for(Map.Entry<Integer,Integer> e:arrFreq.entrySet()){

                int ele=e.getValue();
                if(!modeFreq.containsKey(ele)){
                    modeFreq.put(ele,1);
                }
                else{
                    modeFreq.put(ele,modeFreq.get(ele)+1);
                }

            }
            int max=Integer.MIN_VALUE;
            int minKey=Integer.MAX_VALUE;
            for(Map.Entry<Integer,Integer> e:modeFreq.entrySet()){

                if(e.getValue()>=max) {
                    if(e.getValue()==max){
                        if(e.getKey()<minKey) {
                            max = e.getValue();
                            minKey = e.getKey();
                        }
                    }
                    else{
                        max = e.getValue();
                        minKey = e.getKey();
                    }

                }
            }
            System.out.println(minKey);
        }
    }
	}
}
