
public class StringMethod {
	public static void main (String[] args) {
     
		String Firstname = "Hello";
		String Secondname = "india";
		String c = Firstname.concat(" "+Secondname);
		
		System.out.println(c);
		System.out.println(c.length());
		System.out.println(c.charAt(0));
		System.out.println(c.substring(6,c.length()));
		System.out.println(c.replace(Secondname,"World").toUpperCase());
		System.out.println(c.replace(Secondname,"World").toLowerCase());
		System.out.println(Firstname.contentEquals(Secondname));

	}

}
