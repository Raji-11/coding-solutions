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
		    String s=sc.next();
		    int zero=0;
		    int one=0;
		    for(char ch:s.toCharArray()){
		        if(ch=='0'){
		            zero++;
		        }else{
		            one++;
		        }
		    }
		    
		    if(n%2==1){
		        System.out.println("Yes");
		    }else if(zero==one||zero%2==0&&one%2==0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}
		sc.close();

	}
}
