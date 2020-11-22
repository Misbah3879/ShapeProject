public class TestShape {
	public static void main(String args[])
	{
		Shape s1=new Shape("blue",false);
		System.out.println(s1);	
		Shape s2 = new Circle(4.0);
		System.out.println(s2);	
		Shape s3= new Circle(4.0,"brown",true);
		System.out.println(s3);	
		Shape s4 = new Rectangle(6.0,2.0);
		System.out.println(s4);		
		Shape s5= new Rectangle(5.0,2.0,"White",true);
		System.out.println(s5);	
		Rectangle r1=new Square(3.0);
		System.out.println(r1);	
		Rectangle d1=new Square(3.0,0,"yellow",true,5.0);
		System.out.println(d1);	
	}
}

