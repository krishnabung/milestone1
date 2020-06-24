package classandobject;
import java.util.*;
import java.io.*;
public class Author {


	    public static String email;
	   public static char gender;
	    public static String name;
	    Author(String n,String e,char g)
	    {
	        name=n;
	        email=e;
	        gender=g;
	    }
	    
	    
	}
class Book{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=100;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=10;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("The gender is :"+Author.gender);
    }
    
}

	