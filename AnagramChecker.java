import java.util.Scanner;
import java.util.Arrays;
class AnagramChecker{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two strings to check if they are anagrams:");
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    System.out.println("-----------------------");
    char[] f = str1.toCharArray();
    char[] s = str2.toCharArray();
      
        if(f.length == s.length){
              Arrays.sort(f);
              Arrays.sort(s);
          if (Arrays.equals(f, s)) {  
            System.out.println("The strings are anagrams.");
           }
          else{
            System.out.println("The strings are not anagrams.");
          }
        }
        else{
            System.out.println("The strings are not of the same length, hence cannot be anagrams.");
        }
}
}