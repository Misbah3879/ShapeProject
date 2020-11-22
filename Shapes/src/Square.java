public class Square extends Rectangle {
	Rectangle s1=new Rectangle(3.0,6.0);
	double side;
	 public Square()
	   {
		 super();
		 side=s1.getLength();
	   }
	 Square(double s)
		{
			side=s;
		}
 public Square( double width, double length ,String color, boolean filled,double si)
	   {
		   super( length,width,color, filled);
		   side=si;
	      }
	   public double getSide()
	   {
		   return side;
	   }

	   public void setSide(double s)
	   {
		   side=s;
	   }

	   public double getArea()
	   {
	      return getSide()*getSide();
	   }

	   public double getPerimeter()
	   {
	       return 4*getSide();
	    }
	  
	  
	   public String toString()
	   {
	      return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
	   }
}

