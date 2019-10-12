package StringExample;

public class SwapWord {
	
	 String count(String str)
	{
		
		char[] ch = str.toCharArray();
		for (int i =0;i<ch.length;i++)
		{
			int k=i;
			
			while (i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			
			char temp = ch[k];
			ch[k] = ch[i-1];
			ch[i-1] = temp;
		}
		
		
		return new String (ch);
		
	}
	
	
	public static void main(String arr[])
	{
		String str= "Shailja Pandey love you";
		SwapWord s = new SwapWord();
		System.out.println(s.count(str)); 
		
	}

}
