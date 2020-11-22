public class Shape {
     String color;
     boolean filled;
     Shape()
     {
    	 color="green";
    	 filled=true;
     }
     Shape(String c,boolean f)
     {
    	 color=c;
    	 filled=f;
     }
     String getColor()
     {
    	 return color;
     }
     public void setColor(String co)
  	{	
  		color=co;
  	}
 public void setFilled(boolean fi)
  	{	
  		filled=fi;
  	}
     public boolean isFilled()
     {
         if (filled == true)
         {
             return true;
         }
         else
         {
             return false;
         }
       }
     public String toString()
     {
    	 String IsNot=" ";
    	 if(isFilled() == false)
         {
             IsNot = "not ";
          }
             return "A Shape with color of " + color + " and is " + IsNot + " filled. ";
       }
 }
