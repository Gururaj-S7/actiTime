package demo;

public class construction {

	public static void main(String[] args) {

		System.out.println("hi");
//		new construction();
		new construction().print();

	}

	
	  construction()
	  {
		  System.out.println("constructor");
		  
	  }
	 
	void print() {

		int a = 10;
		int b = 20;

		System.out.println("addition = " + (a + b));

	}

}
