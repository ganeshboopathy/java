import java.util.Scanner;

class Concate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        int d = str1.length() / 2;
        String str4 = "";  
        String str3 = "";  
        
        for (int i = 0; i < d; i++) {
            str4 += str1.charAt(i);
        }

        for (int i = d; i < str1.length(); i++) {
            str3 += str1.charAt(i);
        }

        System.out.println(str4 + str2 + str3);
    }
}
