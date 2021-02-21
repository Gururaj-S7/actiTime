package demo;
import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {
		
		
//		fibo();
		first();
//		revwords();
		/*
		 * Scanner input= new Scanner(System.in);
		 * 
		 * System.out.println("a = "); int a=input.nextInt();
		 * System.out.println("b = "); int b=input.nextInt();
		 * 
		 * System.out.println(a+b);
		 */
	}		
		static void first()
		{
			String original , reverse="";
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter any String :: ");
			
			original=input.next();
			
			int len= original.length();
			
			for(int i=len-1;i>=0;i-- )
			{
				reverse= reverse + original.charAt(i);
			}
		//	System.out.println(reverse);
			
				if(original.equals(reverse))
				    System.out.println("Palindrome");
				else
					System.out.println("Not Palindrome");
					
			
			
			
		}
		
		
		static void fibo()
		{
			
			int n1=0,n2=1,n3,count=10;
			
			System.out.print(n1+" "+n2);
			
			for(int i=2;count>i;++i)
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
				
			}
		}

        static void revwords()
        {
        	
        	String s ="My Name is Gururaj" ;
        	
        	String[] fir = s.split(" ");
        	for (String split_print : fir) 
        	{
        		System.out.println(split_print);
				
			}
        	
        	for(int i=fir.length-1;i>=0;i--)
        	{
        		
        		System.out.print(fir[i]+" ");
        	//	System.out.print(" ");
        		
        		
        	}
        	
        	
        	
        	
   
        	
        }
}


