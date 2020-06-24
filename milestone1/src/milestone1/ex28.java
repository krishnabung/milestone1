package milestone1;

public class ex28 {
	public static void main(String args[])
	{
	 int pin[] = {65,120,98,75,115};
	int i, max1, max2, min1, min2;
	int N = pin.length;

	max1 = pin[0];

	max2=pin[0];

	for(i=0;i<N; i++){

	if(pin[i]> max1)

	max1 = pin[i];

	}

	for(i=0; i<N; i++){

	if(pin[i]>max2 && pin[i]!=max1)

	max2= pin[i];

	}
	int first,second;
	first = second = Integer.MAX_VALUE; 
	        for (i = 0; i < N ; i ++) 
	        { 
	            if (pin[i] < first) 
	            { 
	                second = first; 
	                first = pin[i]; 
	            } 
	            else if (pin[i] < second && pin[i] != first) 
	                second = pin[i]; 
	        }
	System.out.println("Largest 2 numbers are: "+max1+" "+max2);
	System.out.println("Smallest 2 numbers are: "+first+" "+second);
	}
	}
