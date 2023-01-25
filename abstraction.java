//Rutvik-java coding
// Best program to explain the concept of Abstraction in JAVA
abstract class twod
{
	protected double dim1 , dim2;
	public twod(double d1,double d2)
	{
		dim1 = d1;
		dim2 = d2;
	}
	abstract public void area(); //abstract class(empty) need to be define in derived class
}
class rectangle extends twod
{
	public rectangle(double d1, double d2)
	{
		super(d1,d2);
	}
	public void area()
	{
		double a;
		a = dim1 * dim2;
		System.out.println("Area of Rectangle:"+a);
	}
}
class triangle extends twod
{
	private double dim3; //bcoz triangle needs three parameters
	public triangle(double d1,double d2, double d3)
	{
		super(d1,d2);
		dim3 = d3;
	}
	public void area()
	{
		double s,a;
		s = (dim1+dim2+dim3);
		a = Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
		System.out.println("Area of Triangle:"+a);
	}
}
//we can add many more shapes for calculating area
//driver class
class abstraction
{
	public static void main(String args[])
	{
		rectangle robj = new rectangle(10,20);
		triangle tobj = new triangle(18,24,30);
		robj.area();
		tobj.area();
	}
}







