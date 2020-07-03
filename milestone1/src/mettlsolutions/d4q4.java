package mettlsolutions;
import java.util.*;
import java.io.*;
public class d4q4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
        int n,n1,d,s=0;
        System.out.println ("enter a digit");
        n=sc.nextInt();
        System.out.println ("enter another digit");
        n1=sc.nextInt();
        d=n%10;  
        s+=d;
        d=n1%10;
        s+=d;
        System.out.println ("sum of first and last digit number= "+s);
	}

}
