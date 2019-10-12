package StringExample;

public  class DuplicateChar{
	static final int MAX_CHAR = 256; 
	
	private static void getOccuringChar(String str) {
		
		int[] count = new int[MAX_CHAR];
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
		}
		
		char ch[] = new char[len];
		for(int j=0;j<len;j++)
		{
			ch[j] = str.charAt(j);
			int find = 0;
			for(int k=0;k<=j;k++)
			{
				if(ch[j]==ch[k])
					find++;
				
			}
			
			if(find ==1)
				System.out.println("Number of Occurrence of " + 
		                 str.charAt(j) + " is:" + count[str.charAt(j)]);  
		}
		
		
	}

	  

public static void main(String arr[])
{
	String str = "aba sab";
	getOccuringChar(str); 
	
	byte i =-128;
	
	char ch = '\n';
	System.out.println(ch);
	
	
	
	int[] x = new int[4]; 
   int len = x.length; 


}

	


	}

	


