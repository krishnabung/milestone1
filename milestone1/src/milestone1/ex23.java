package milestone1;

public class ex23 {
	public static void main(String args[])
	{
	 int c = 0;
	 int num = 1;
	while(c<5)
	{
		while(num>=1)
		{
			if((num %2==0 && num%3==0) && (num%5==0))
				{
					c = c+1;
					System.out.println(num+" ");
					}
			num = num + 1;
			if(c==5)
			 {
				break;
				}		
		}
	}
	}

}
