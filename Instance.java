package letcode;

public class Instance {
	
	int a ;
	
	public void calc(int b,int c)
	{	int a =20;
		System.out.println(a+b+c);
	}

	public void mul(int c) 
	{
		a = 30;
		System.out.println(a*c);
	}
		
	
	public static void main(String[] args) 
	{
		Instance in = new Instance();
		in.calc(90,100);
		in.mul(25);
	}

}
