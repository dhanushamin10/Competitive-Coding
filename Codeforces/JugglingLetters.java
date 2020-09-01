import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Solution{
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            while(T-->0){
                int N=sc.nextInt();
                sc.nextLine();
                String[] arr=new String[N];
                for(int i=0;i<N;i++){
                    arr[i]=sc.nextLine();
                }
                HashMap<Character,Integer> hm=new HashMap<>();
                for(String s:arr){
                    for(int i=0;i<s.length();i++){
                        char ch=s.charAt(i);
                        if(!hm.containsKey(ch)){
                            hm.put(ch,1);
                        }
                        else{
                            hm.put(ch,hm.get(ch)+1);
                        }
                    }
                }
                int flag=1;
                for(Map.Entry<Character,Integer> e:hm.entrySet()){
                    if(e.getValue()%N!=0){
                        System.out.println("NO");
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                    System.out.println("YES");
        }
    }
}