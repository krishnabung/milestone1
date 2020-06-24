package milestone1;

public class ex35 {
	public static void main(String args[])
	{
	int n = args.length;
	int i;
	int a[] = new int[3];
	int b[] = new int[3];
	for(i=0;i<n/2;i++)
	{
	a[i] = Integer.parseInt(args[i]);
	}
	for(i=0;i<n/2;i++)
	{
	b[i] = Integer.parseInt(args[(n/2)+i]);
	}
	System.out.println(a[1]+" " + b[1]);
	}


}
