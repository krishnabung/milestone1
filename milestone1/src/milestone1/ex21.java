package milestone1;

public class ex21 {
	public static void main(String args[])
	{
	int num = Integer.parseInt(args[0]);
	int reversenum = 0;
	while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println(reversenum);
	}


}
