package letcode;

public class Person 
{
	int a = 20;
	static int b = 20;
	
	void incre()
	{
		a++;
		b++;
		System.out.println("value of non static: "+a+ "Value of static :"+b);
	}
	
	void reuse()
	{
		int c = a*b;
		System.out.println("Value of C: "+c);
		return;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person ps = new Person();
		ps.incre();
		ps.incre();
		ps.reuse();
		System.out.println("New trigger");
		Person ps1	= new Person();
		ps1.incre();
		ps1.reuse();
		System.out.println(ps1.a);
		
	}

}
