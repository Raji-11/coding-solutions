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
		    int k=sc.nextInt();
		    
		    int time = 0;
            int work = 0;

            while (work < n) {
                time++;

                if (time % k != 0) {
                    work++;
                }
            }

            System.out.println(time);
		}

	}
}
