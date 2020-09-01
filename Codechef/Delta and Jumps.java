/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 int V; 
    LinkedList<Integer>[] adjListArray; 
      
    // constructor 
    Codechef(int V) { 
        this.V = V; 
      
        adjListArray = new LinkedList[V]; 
  
      
  
        for(int i = 0; i < V ; i++){ 
            adjListArray[i] = new LinkedList<Integer>(); 
        } 
    } 
      
  
    void addEdge( int src, int dest) { 
       
        adjListArray[src].add(dest); 
  
      
        adjListArray[dest].add(src); 
    } 
     static String s="";
     static int count=0;
    void DFSUtil(int v, boolean[] visited) { 
   
        visited[v] = true; 
        
        s+=Integer.toString(v);
        
        
        for (int x : adjListArray[v]) { 
            if(!visited[x]) DFSUtil(x,visited); 
        } 
  
    } 
    int connectedComponents() { 
         
        boolean[] visited = new boolean[V]; 
        for(int v = 0; v < V; ++v) { 
            if(!visited[v]) { 
                
                DFSUtil(v,visited); 
                if(s.length()>=1) count++;
               
                s="";
            } 
        } 
        return count;
    } 
      
      
    
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
        int T=sc.nextInt();
        while(T-->0){
        int N=sc.nextInt();
        int M=sc.nextInt();
        Codechef g = new Codechef(N);  
        for(int k=0;k<M;k++){
        int i=sc.nextInt();
        int j=sc.nextInt();
        g.addEdge(i,j);
        }
       
        int ans=g.connectedComponents(); 
        System.out.println(count);
        count=0;
        }
    } 
    }
}
