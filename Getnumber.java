import java.util.Scanner;
class GetNumber{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String n = sc.nextLine();
      String g ="";
      for(int i=0;i<n.length();i++){
        char c = n.charAt(i);

        if(c >= '0' && c <= '9'){
          g += c;
        }
      }
      System.out.println("Extracted numbers: " + g);

    }
}