public class Square extends Rectangle {
	Rectangle s1=new Rectangle(3.0,6.0);
	 public Square()
	   {
		 super();
		double side=2.0;
	   }
	 Square(double s)
		{
			s=s;
		}
 public Square( double width, double length ,String color, boolean filled,double si)
	   {
		   super( length,width,color, filled);
		   si=si;
	      }
	   public double getSide()
	   {
		   return width;
	   }

	   public void setSide(double s)
	   {
		   super.setLength(s);
		   super.setWidth(s);
	   }

	   public double getArea()
	   {
	      return getSide()*getSide();
	   }

	   public double getPerimeter()
	   {
	       return (4*getSide());
	    }
	   public String toString()
	   {
	      return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
	   }
}

