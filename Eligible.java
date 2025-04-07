import java.util.Scanner;

class Eligible {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age");
     byte age = sc.nextByte();
     if(age>=18){
        System.out.println("You are eligible to vote");
     }
     else{
        System.out.println("You are not eligible to vote");
     }
    }
}