package milestone1;

public class ex31 {
	public static void main(String args[])
	{
	int sum=0,i;
	    boolean add = true;
	   int n = args.length;
	int array[]=new int[n];
	for(i=0;i<n;i++)
	{
	array[i] = Integer.parseInt(args[i]); 
	}
	    for(i=0; i<array.length;i++)
	    {

	        if(array[i] != 6 && add==true)
	            sum = sum+array[i];
	        else if(array[i] == 6){
	            if((i+1) == array.length)
	                sum = sum+array[i];
	            else
	                add = false;
	        }
	        else if(array[i] == 7)
	            add = true;
	    }
	    System.out.println(sum); 
	 }


}
