package StringTraining;


class Palindrome{
	
	public void PalindromeCheck(String s) {
		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
			
			System.out.println(rev);
			
			if(s.equals(rev))
			{
				System.out.println("Given word is palindrome");
			}	
			}		
		
	}
}


public class StringPalindroe {
	
	public static void main(String[] args) {
		
		Palindrome pali = new Palindrome();
		
		String s = "ammaa";
		
		pali.PalindromeCheck(s);	
		
	}

}
