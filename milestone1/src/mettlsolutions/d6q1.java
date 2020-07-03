package mettlsolutions;
import java.util.*;
import java.io.*;
public class d6q1 {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    int n,c=0;
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
    	{
    		c++;
    	}
    }
    if(c==2)
    {
    	System.out.println("2");
    }
    else
    {
    	System.out.println("1");
    }
}
}	
