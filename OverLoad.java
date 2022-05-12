class OverLoad
{
	OverLoad(int x)
	{
		System.out.println("integer="+x);
	}
	OverLoad(double y)
	{
		System.out.println("double="+y);
	}
	OverLoad(string s)
	{
		System.out.println("string="+s);
	}
	public static void main(String[] args)
	{
		OverLoad  p=new OverLoad(10);
		OverLoad  q=new OverLoad(29.9);
		OverLoad  r=new OverLoad("deepthi");
	}
}