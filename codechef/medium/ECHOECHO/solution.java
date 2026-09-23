import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		if(s.charAt(0)==s.charAt(2)&&s.charAt(1)==s.charAt(n-1)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}
