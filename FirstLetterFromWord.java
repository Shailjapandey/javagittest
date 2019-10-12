package StringExample;

public class FirstLetterFromWord {
	
	public String firstLetter(String str)
	{
		boolean v = true;
		String r = "";
		
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' ')
				v=true;
			
			while(str.charAt(i)!=' ' && v==true)
			{
				r+= str.charAt(i);
				v= false;
				
			}
			
		}
		
		
		return new String(r);
		
	}
	
	

	public static void main(String[] args) {
		
		String str = "Shailja Pandey 34";
		FirstLetterFromWord f = new FirstLetterFromWord();
		System.out.println(f.firstLetter(str));
		

	}

}
