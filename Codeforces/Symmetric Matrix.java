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
            String[] str1=read.readLine().split(" ");
            int N=Integer.parseInt(str1[0]);
            int M=Integer.parseInt(str1[1]);
 
            boolean isSymmetric=false;
            while(N-->0){
                int[][] arr=new int[2][2];
                String[] str2=read.readLine().split(" ");
                String[] str3=read.readLine().split(" ");
                arr[0][0]=Integer.parseInt(str2[0]);
                arr[0][1]=Integer.parseInt(str2[1]);
                arr[1][0]=Integer.parseInt(str3[0]);
                arr[1][1]=Integer.parseInt(str3[1]);
                if(isSymmetric(arr,2)){
 
                    isSymmetric=true;
                }
 
            }
 
            if(M%2!=0) {
 
                isSymmetric=false;
 
            }
      
            if(isSymmetric) System.out.println("YES");
            else System.out.println("NO");
 
        }
 
        }
    static boolean isSymmetric(int mat[][], int N)
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] != mat[j][i])
                    return false;
        return true;
    }
}