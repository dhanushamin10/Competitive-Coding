import java.io.*;
 
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            String[] str=read.readLine().split(" ");
            int M=Integer.parseInt(str[0]);
            int N=Integer.parseInt(str[1]);
            int d=10;
            int count=0;
            int diff;
            if(M==N) count=0;
            else
            if(M<N){
                diff=N-M;
                count+=diff/10;
                if (diff%10!=0)
                count++;
            }
            else{
                diff=M-N;
                count+=diff/10;
                if (diff%10!=0)
                count++;
            }
            System.out.println(count);
        }
 
    }
}