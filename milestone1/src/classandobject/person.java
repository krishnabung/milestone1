package classandobject;

public class person {
	String name;

}
class Employee extends person
{
	double salary;
	int yearstarted;
	String NIN;
	 public void setsalary(double s)
	    {
	        salary=s;
	    }
	    public double getsalary()
	    {
	        return salary;
	    }
	    public void setys(int ys)
	    {
	        yearstarted=ys;
	    }
	    public int getys()
	    {
	        return yearstarted;
	    }
	    public void setNIN(String N)
	    {
	        NIN=N;
	    }
	    public String getNIN()
	    {
	        return NIN;
	    }
	    public void setname(String na)
	    {
	        name=na;
	    }
	    public String getname()
	    {
	        return name;
	    }
}
