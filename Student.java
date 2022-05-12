class Student123
{
	int rollno;
	string name;
	student(int i,string n)
	{
		rollno=i;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name);
	}
                  public static void main(String[] args)
	{
		Student s=new Student(1231,"deepthi");
		s.display();
	}
}