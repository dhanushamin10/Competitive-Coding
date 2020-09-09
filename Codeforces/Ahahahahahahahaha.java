import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

final public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T-->0){
            int N=Integer.parseInt(br.readLine());
            String[] str=br.readLine().split(" ");
            int[] arr=new int[N];
            for(int i=0;i<N;i++) arr[i] = Integer.parseInt(str[i]);
            int relativeSum=findSum(arr,N);
            if(relativeSum==0) {
                System.out.println(N);
                for (int i=0;i<N;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else{

                int countOfOnes=findOnes(arr,N);
                int countOfZeroes=findZeroes(arr,N);

                if(countOfOnes>countOfZeroes){

                    removeZeroes(countOfOnes);

                }
                else{
                    removeOnes(countOfZeroes);
                }
            }
        }
    }

    private static void removeZeroes(int countOfOnes) {
        if(countOfOnes%2!=0) countOfOnes--;
        System.out.println(countOfOnes);
        for(int i=0;i<countOfOnes;i++){
            System.out.print(1+" ");
        }
        System.out.println();
    }

    private static void removeOnes(int countOfZeroes) {
        System.out.println(countOfZeroes);
        for(int i=0;i<countOfZeroes;i++){
            System.out.print(0+" ");
        }
        System.out.println();
    }


    private static int findZeroes(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count++;
        }
        return  count;
    }

    private static int findOnes(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) count++;
        }
        return count;
    }

    static int findSum(int[] arr,int N){
        int sum=0;
        for(int i=0;i<N;i++){
            if(i%2==0) sum+=arr[i];
            else sum-=arr[i];
        }
        return sum;
    }

}