import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    
		    int c[]=new int[n];
		    long w[]=new long[n];
		    
		    for(int i=0;i<n;i++){
		        c[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        w[i]=sc.nextInt();
		    }
		    
		    long p[]=new long[n+1];
		    for(int i=0;i<n;i++){
		        p[i+1]=p[i]+w[i];
		    }
		    
		    int l=0;
		    
		    long sum=0;
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    
		    for(int r=0;r<n;r++){
		        if(hm.containsKey(c[r])){
		            int nl=hm.get(c[r])+1;
		            if(nl>l){
		                l=nl;
		            }
		        }
		        hm.put(c[r],r);
		        long curr=p[r+1]-p[l];
		        if(curr>sum){
		            sum=curr;
		        }
		    }
		    
		    
		    System.out.println(sum);
		}
		sc.close();

	}
}
