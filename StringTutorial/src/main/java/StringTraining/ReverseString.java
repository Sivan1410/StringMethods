package StringTraining;

class Reverse{
	
	public void ReverseStringExample(String str) {
		
	 String newString = "" ;
	 
	 for(int i=0;i<str.length();i++) {
		 
		char ch= str.charAt(i);
		newString= ch+newString;
	 }
	 
	 System.out.println(newString);
	}
	
	public void ReverseStringUsingStringBuffer(String str) {
		
		StringBuffer buffer= new StringBuffer(str);
		
	    System.out.println(buffer.reverse());		
	}
	
	public void ReverseStringUsingCharArr() {
		
		String str = "VIJAY";
		
		char[] chars=str.toCharArray();
		
		for(int i= chars.length-1;i>=0;i--) {
			
			System.out.println("Reversed String: "+chars[i]);
		}
	}
}


public class ReverseString {

	public static void main(String []args) {
		Reverse reverse = new Reverse();
		
		String str= "Thalaivaa";
		
		reverse.ReverseStringExample(str);
		
		String StringBuff= "Thala";
		reverse.ReverseStringUsingStringBuffer(StringBuff);
		
		reverse.ReverseStringUsingCharArr();

	}
	
}
