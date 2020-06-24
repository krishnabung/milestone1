package milestone1;

public class ex24 {
	public static void main(String args[])
	{
	int [] a = new int[]{1,4,34,56,7};
	int n = a.length;
	int sum = 0;
	double average;
	for(int i=0;i<n;i++)
	{
	sum = sum+a[i]; 
	}
	System.out.println("The sum of array elements is "+ sum);
	average = sum / n;
	System.out.println("The average of array elements is "+average);
	}


}
