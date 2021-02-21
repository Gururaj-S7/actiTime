package demo;

public class Duplicate_va 
{ static int count=0;
	public static void main(String[] args) {
	
		
	

		
		String str= "I am Software Tester";
		String str1 = str.replaceAll(" ", "");
		char[] str2 = str1.toLowerCase().toCharArray();
		
		for (int i=1;i<str2.length;i++)
		{
			
			for (int j=i+1;j<str2.length;j++)
			{
				if(str2[i]==str2[j])
				{
				count++;	
					System.out.println(str2[j] + " "+count);
					break;
				}
				
			}
			
		}
		
		
	}
	
}
