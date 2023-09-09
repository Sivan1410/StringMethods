package StringTraining;

import java.util.Arrays;

class Anagram{
	
	public void AnagramExample(){
		
		String Str1 = "Race";
		String Str2 = "Care";
		
		Str1= Str1.toLowerCase();
		Str2= Str2.toLowerCase();
		
		if(Str1.length() == Str2.length()) {
			
			char[] CharStr = Str1.toCharArray();
			char[] CharStr2 = Str2.toCharArray();
			
			System.out.println(CharStr);
			System.out.println(CharStr2);			
			
			Arrays.sort(CharStr);
			Arrays.sort(CharStr2);
			
			if(Arrays.equals(CharStr,CharStr2))
			{
				System.out.println("This is Anagram");
			}
			else {
				System.out.println("Not");
			}
					}
	}
}

public class AnagramExample {

	public static void main(String []args) {
		
		Anagram am = new Anagram();
		
		am.AnagramExample();
	}
}
