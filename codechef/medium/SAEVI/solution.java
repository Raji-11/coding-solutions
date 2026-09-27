import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(i%2==0){
		        if(2*k<arr[i]){
		            sum=sum+arr[i];
		        }
		    }
		}
		System.out.println(sum);

	}
}
