package milestone1;

public class ex25 {
	public static void main(String args[])
	{
	int [] a = new int[]{1,4,34,56,7};
	int max = 0;
	     
	      for(int i=0; i<a.length; i++ ) {
	         if(a[i]>max) {
	            max = a[i];
	         }
	      }
	int min = a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]<min)
	{
	min = a[i];
	}
	}
	System.out.println("The Maximum Element in array is "+max);
	System.out.println("The Minimum Element in array is "+min);
	}


}
