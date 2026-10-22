# NAME2 - Rating 1080

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T09:38:57.251Z  

```java
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
		    int arr[]=new int[n];
	     	for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
	     	TreeSet<Integer> ts=new TreeSet<>();
	     	
	    	for(int i=0;i<n;i++){
		        ts.add(arr[i]);
	    	}
	    	System.out.println(ts.size());
	    	for (int x : ts) {
                System.out.print(x + " ");
            }
            System.out.println();
	    	
	   }
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NAME2)