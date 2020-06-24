package milestone1;

public class exw6 {
	public static void main(String args[])
	{
	int k = Integer.parseInt(args[0]);
	int[] arr = new int[]{1,4,34,56,7};
	int n = arr.length;
	int i,flag=0;
	for(i = 0; i < n; i++)
	        {
	            if(arr[i] == k)
	            {
	                flag = 1;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
	        {
	            System.out.println("Element found at position:"+(i));
	        }
	        else
	        {
	            System.out.println("-1");
	        }
	}


}
