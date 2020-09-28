import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*package whatever //do not write package name here */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main {
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            int N=Integer.parseInt(read.readLine());
            String str=read.readLine();
            int ans=0;
            if(str.length()==1){
                if((int)str.charAt(0) % 2==0){
                    ans=2;
                }
                else{
                    ans=1;
                }
            }
            else{
            if(str.length()%2==0){
                for(int i=0;i<str.length();i++){
                    if((i+1)%2==0 && (int)str.charAt(i) % 2==0){
                        ans=2;
                        break;
                    }
                }
                if(ans==0) ans=1;
            }
            else{
                for(int i=0;i<str.length();i++){
                    if((i+1)%2!=0 && (int)str.charAt(i) % 2!=0){
                        ans=1;
                        break;
                    }
                }
                if(ans==0) ans=2;
            }
            }
            System.out.println(ans);
        }
    }
}