package StringTraining;

import java.util.Scanner;

class SplitedExample {

	public void SplitWords()
	{
		String splitWords = "This is a String";

		String[] Splitted = splitWords.split(" ");
		
		for(String Split:Splitted)
		{
			System.out.println(Split);
		}
	}
	
	public void SplitWordsUsingScanner() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String GivenString = sc.nextLine();
		
		String[] Splitted = GivenString.split(" ");
		
		for(String Split : Splitted)
		{
			//System.out.print(Split);
			
			int countOfString = Split.length();
			
			if(countOfString % 2 ==0) {
				
				System.out.println(Split);
			}
						
			}	
		
		sc.close();
		
	}

	public void SplitwordUsingArray(String s) {
		
		String [] Words= s.split(" ");
		
		int[] wordLength = new int[Words.length];
		
		for(int i=0; i<Words.length;i++)
		{
			wordLength[i]=Words[i].length();
			//System.out.println("Count: "+ wordLength[i]);
			
			if(wordLength[i] % 2 == 0) {
				
				System.out.println(Words[i]);
			}
		}
		
		
	}
}

public class SplitExample{
	
	public static void main(String []args)
	{
		SplitedExample example = new SplitedExample();
		
		example.SplitWords();
		
		//example.SplitWordsUsingScanner();
		
		String s = "I am a Hero Of this Testings";
		
		example.SplitwordUsingArray(s);
		
	}
}


