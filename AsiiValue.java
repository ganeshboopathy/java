import java.util.Scanner;

class AsiiValue{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the character");
     char ch = sc.next().charAt(0);
     int ascii = (int)ch;
     System.out.println("The ASCII value of " + ch + " is " + ascii);
    }
}