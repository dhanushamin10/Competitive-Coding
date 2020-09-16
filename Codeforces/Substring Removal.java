import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main {
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            
            String str=read.readLine();
            ArrayList<Integer> list=new ArrayList<>();
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') count++;
                if(str.charAt(i)=='0'){
                    if(count>0) {
                        list.add(count);
                    }
                    count=0;
                }
            }
            if(count>0) list.add(count);

            int alice=0;
            list.sort(Collections.reverseOrder());
            for(int i=0;i<list.size();i++){
                if(i%2==0){
                    alice+=list.get(i);
                }
            }

            System.out.println(alice);
        }

    }
}
