import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public final class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            String[] str=read.readLine().split(" ");
            long x=Long.parseLong(str[0]);
           long y=Long.parseLong(str[1]);  // 42 13 24
           long k=Long.parseLong(str[2]);
           long numOfSticks=(y+1)*k-1;
           long StickTime=numOfSticks/(x-1);
           if(numOfSticks % (x-1)!=0) StickTime++;
            System.out.println(StickTime+k);
        }

    }


}