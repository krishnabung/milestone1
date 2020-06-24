package milestone1;

public class ex32 {
	public static void main(String args[])
	{
		int k = args.length;
		int nums[] = new int[k];
		for(int i=0;i<k;i++)
		{
		nums[i] = Integer.parseInt(args[i]); 
		}

		int i = 0;
	    
	    while(i < nums.length && nums[i] != 10)
	        i++;
	              
	    for(int j = i + 1; j < nums.length; j++) {
	        if(nums[j] != 10) {
	            nums[i] = nums[j];
	            nums[j] = 10;
	            i++;
	        }
	    }
	                                              
	    for( ; i < nums.length; i++)
	        nums[i] = 0;
	     for(i=0;i<nums.length;i++)
		{
		System.out.print(nums[i]+" ");
		}
	}


}
