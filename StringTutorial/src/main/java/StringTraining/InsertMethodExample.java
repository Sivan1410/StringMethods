package StringTraining;

class InsertMethodExamples {
	
	public void InsertExample() {
		
		StringBuffer buffer = new StringBuffer("GeeksGeeks");
		
		buffer.insert(5, "For");
		
		System.out.println(buffer);
	}
	
	public String AnotherMethod(String s , String InsertedString, int indexPosition) {
		
		String newString = new String();
		
		for(int i=0; i<s.length();i++)
		{
			newString  += s.charAt(i);
			
			if(i==indexPosition) {
				newString += InsertedString;
			}
		}
		
		return newString;		
		
	}

}

public class InsertMethodExample {
	
	public static void main(String []args) {
		
		InsertMethodExamples examples = new InsertMethodExamples();
		
		examples.InsertExample();
		
		int IndexPos= 4;
		
		String NewOne = examples.AnotherMethod("GeeksGeeks", "For", IndexPos);
		
		System.out.println(NewOne);
		
		
	}
}
