package demo;

public class first {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
		
//		print();                       //static method
		first f = new first();        
//		f.print1();                    //non static
                                       //		new first().print1();
//		f.print2();           //swap using third variable
//		f.print3();           //swap without third variable
		f.print4();
		
	}
	
	static void print()
	{
		
		System.out.println("static method");
		
	}
	
	void print1()
	{
		
		System.out.println("non static method");
		
	}
	
	void print2()
	{
		
		int a=10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	void print3()
	{
		
		int x=40;
		int y=50;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y); 
	}
	

	void print4()
	{
		
		int[] my = {10,20,30,40,50};
		
		
		System.out.println(my[3]);
		
	}
	
	
}
