package StringTraining;


class AddaCharacter{
	
	public void addaCharUsingStringMethods() {
		
		String str = "GeeksForGeek";
		
		char ch = 's';
		
		System.out.println(str+ ch);
	}
	
	public String addACharUsingInsertMethod(String s, int position, String AddedNewString) {
		
		StringBuffer buffer = new StringBuffer(s);
		
		StringBuffer buf = buffer.insert(position, AddedNewString);
		
		return buf.toString();
	}
	
}

public class AddACharacterToAString {
	
	public static void main(String []args) {
		
		AddaCharacter character = new AddaCharacter();
		
		character.addaCharUsingStringMethods();
		
		String str1 = "GeeksForGeeks";
		
		int pos = 5;
		
		String InsertedStr = "For";
		
		String NewString  = character.addACharUsingInsertMethod(str1, pos, InsertedStr);
		
		System.out.println(NewString);
	}

}
