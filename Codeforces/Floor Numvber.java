
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
 
public final class Main{
    public static void main(String[] args) throws IOException {
 
        BufferedReader read=new BufferedReader((new InputStreamReader(System.in)));
        int T=Integer.parseInt(read.readLine());
        while(T-->0) {
            String[] str=read.readLine().split(" ");
            int N=Integer.parseInt(str[0]);
            int X=Integer.parseInt(str[1]);
            if(N==1 || N==2) {
                System.out.println(1);
                continue;
            }
            int ans=(int)Math.ceil((float)(N-2)/X) +1 ;
            System.out.println(ans);
        }
 
        }
}