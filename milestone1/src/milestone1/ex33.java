package milestone1;

public class ex33 {
	public static void main(String args[])
	{
	int k = args.length;
		int nums[] = new int[k];
		for(int i=0;i<k;i++)
		{
		nums[i] = Integer.parseInt(args[i]); 
		}
	int countE = 0;
	  int countO = nums.length-1;
	  int[] array = new int[nums.length];
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 2 == 0) {
	      array[countE] = nums[i];
	      countE++;
	    } 
	    else {
	      array[countO] = nums[i];
	      countO--;
	    }
	  }
	for(int i=0;i<nums.length;i++)
	{
	System.out.print(array[i]+" ");
	}
	}

}
