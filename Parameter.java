class Parameter
{
	Parameter(int a)
	{
		System.out.println("a="+a);
	}
	Parameter(double b)
	{
		System.out.println("b="+b);
	}
	public static void main(String[] args)
	{
		Parameter p=new Parameter(10);
		Parameter p1=new Parameter(30.9);
	}
}