package letcode;

public class Learner 
{


	int a;
	String str;
	float b;
	double c;
	
	
	void display()
	{
		System.out.println(a+str+b+c);
	}
	
	Learner(int la,String lstr,float lb,double lc)
	{
		this.a = la;
		this.str = lstr;
		this.b = lb;
		this.c = lc;
		
	}
	
	Learner (int la,String lstr,float lb)
	{
		this.a = la;
		this.str = lstr;
		this.b = lb;
	}
	public static void main(String[] args) 
	{
		Learner ls1 = new Learner(90,"mano",18f,90.76);
		ls1.display();
		Learner ls2 = new Learner(100,"guru",90f);
		ls2.display();
	}

}
