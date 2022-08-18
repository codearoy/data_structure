package fundamentals;

public class output{
	public static void main (String[] args) {
	    int a=50,b=20;
	    if(a>b)
	    {
	        if(a>100)
	            System.out.println("Ace");
	        if(b<100)
	            b=50;
	    }
	    else if(a==b)
	    {
	        System.out.println("King");
	    }
	    else 
	    {
	        System.out.println("Queen");
	    }
	}
}