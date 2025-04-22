
public class RemoveRepeatedCharactor {

	public static void main(String[] args) {
        String b = "Hello World ";  
        String c = "";
        for(int i =0;i<b.length();i++) {
        	if(c.indexOf(b.charAt(i))==-1) {
        		c+=b.charAt(i);
        	}
        }
        System.out.println(c);
		
	}

}
