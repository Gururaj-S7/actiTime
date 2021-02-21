package demo;




 class inherit {
	
	public static void main(String[] args) {
		
		new demo3();
	}
		

		
	}


class demo1 
{
	
	demo1()
	{
		
		System.out.println("second constructor");
		
	}

}

class demo2 extends demo1
{
 	
demo2()
{
	super();
	System.out.println("third constructor");
	
	}

}

class demo3 extends demo2
{
		
		 demo3()
		{
			
			 System.out.println("fourth constructor");
		}
	
}