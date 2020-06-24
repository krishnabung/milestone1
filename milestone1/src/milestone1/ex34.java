package milestone1;

public class ex34 {
	public static void main(String args[])
	{
	int k = args.length;
		int nums[] = new int[k];
		for(int i=0;i<k;i++)
		{
		nums[i] = Integer.parseInt(args[i]); 
		}
	boolean isTrue = true;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 1 && nums[i] != 4)
	      isTrue = false;
	  }
	System.out.print(isTrue+" ");
	}


}
