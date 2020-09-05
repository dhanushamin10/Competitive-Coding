import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0){
            String[] str=read.readLine().split(" ");
            int A=Integer.parseInt(str[0]);
            int B=Integer.parseInt(str[1]);
            int X=Integer.parseInt(str[2]);
            int Y=Integer.parseInt(str[3]);
            int K=Integer.parseInt(str[4]);
            int A1=A;
            int B1=B;
            int K1=K;
            //DEC A ROUTE
            long prod1,prod2;
            int maxCanSubFromA=A-X;// 2
            int maxCanSubFromB=B-Y;// 5 k=3
            //route 1
            // sub from A first;
            if(K<maxCanSubFromA) {
                A=A-K;
                K=0;
            } else{
                K-=maxCanSubFromA;
                A-=maxCanSubFromA;
            }
            if(K>0){
                if(K<maxCanSubFromB){
                    B-=K;
                    K=0;
                }
                else{
 
                    K-=maxCanSubFromB;
                    B-=maxCanSubFromB;
                }
            }
            /////////
            prod1=(long)A*B;
 
            if(K1<maxCanSubFromB) {
                
                B1=B1-K1;
                K1=0;
            } else{
                K1-=maxCanSubFromB;
                B1-=maxCanSubFromB;
            }
            if(K1>0){
                if(K1<maxCanSubFromA){
                    A1-=K1;
                    K1=0;
                }
                else{
 
                    K1-=maxCanSubFromA;
                    A1-=maxCanSubFromA;
                }
            }
           prod2=(long)A1*B1;
            long x=Math.min(prod1,prod2);
            System.out.println(x);
 
        }//while
 
    }
}