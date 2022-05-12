public class DemoClass
{
	int add(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mul(int x,int y)
	{
		return x*y;
	}
	int div(int x,int y)
	{
		return x/y;
	}
	int rem(int x,int y)
	{
		return x%y;
	}
        public static void main(String[] args)
        {
	DemoClass dc=new DemoClass();
	dc.add(10,20);
	dc.sub(20,10);
	dc.mul(5,3);
	dc.div(10,2);
	dc.rem(5,3);
        }
}