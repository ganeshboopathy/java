
public class FindTheCharName {

	public static void main(String[] args) {
		String a = "Ganeshboopathyggg";
		String b= "";
		String h=  a.toLowerCase();
		for(int i = 0;i<h.length();i++) {
			if(b.indexOf(h.charAt(i))!=-1) {
				continue;
			}
			
			int count = 0;
			for(int j=0;j<h.length();j++) {
				if(h.charAt(i) == h.charAt(j)){		
					count++;				
				}
			}
			 b+=h.charAt(i)+":"+count+",";

		}
		System.out.println(b);
	}
}
