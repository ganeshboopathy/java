import java.util.Scanner;
class UseScanner
{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number :");
    int num = sc.nextInt();
    System.out.println("enter the second number :");
    int num2 = sc.nextInt();
    int a=num+num2;
    int b=num-num2;
    int c=num*num2;
    int d=num/num2;
    System.out.println("Addition :"+a);
    System.out.println("supration:"+b);
    System.out.println("multiplication :"+c);
    System.out.println("division :"+d);
 }      
    
}