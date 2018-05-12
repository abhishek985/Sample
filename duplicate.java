public class duplicate {
	public static void main(String args[])
	{
		String st ="abkllllllllllkkkkkkkkkkkkkhhhhhhhhhhhhhhnnnnnnnnnnllllssssssf";
		StringBuilder sb = new StringBuilder(st);
		for(int i=0;i<=sb.length()-1;i++)
		{
			//System.out.println(sb.length());
			char ch=' ';
			if(i!=sb.length()-1 && sb.charAt(i)==(sb.charAt(i+1)))
			{ 
				ch=sb.charAt(i);

				while(sb.charAt(i)==ch && i!=sb.length()-1)

					sb.deleteCharAt(i);
		
				if(i==sb.length()-1 && sb.charAt(i)==ch)
				{
					sb.deleteCharAt(i);
				}

				i--;
			}
		}
		System.out.println(sb);
	}
}


