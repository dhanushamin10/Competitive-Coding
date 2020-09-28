import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
 
public final class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader read=new BufferedReader((new InputStreamReader(System.in)));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            String[] str1=read.readLine().split(" ");
            String[] str2=read.readLine().split(" ");
            int N=Integer.parseInt(str1[0]);
            int K=Integer.parseInt(str1[1]);
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(str2[i]);
            }
            int count=0;
            int min=arr[0];
            int pos=0;
            for(int i=1;i<N;i++){
                if(arr[i]<min){
                    pos=i;
                    min=arr[i];
                }
            }
 
            while(true){
                boolean isAdded=false;
                for(int i=0;i<N;i++){
                    if(i==pos) continue;
                    if(arr[i]+min<=K) {
                        arr[i]+=min;
                        isAdded=true;
                        count++;
                    }
                }
                if(!isAdded) break;
            }
            System.out.println(count);
 
        }
 
    }
 
 
 
 