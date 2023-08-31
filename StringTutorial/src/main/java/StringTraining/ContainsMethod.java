package StringTraining;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str21 = "Physics and Maths";
	
	System.out.println("And is there or not: "+ str21.contains("And"));
	
	System.out.println("ContentEqual Method:"+str21.contentEquals("Physics and Maths"));
	
	StringBuffer buffer = new StringBuffer();
	
	buffer.append(str21);
	
	System.out.println("ContentEqualsUsingStringBuffer: "+ str21.contentEquals(buffer));
	

	}

}
