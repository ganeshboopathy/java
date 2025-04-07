import java.util.Scanner;
class Ebill{

public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Unite :");
 int num = sc.nextInt();
 
 if(num<=100){
   System.out.println("free unite");
}
else if(num>=100 && num<=200){
 num=num-100;
 System.out.println("$"+(num*5));
}
else if(num>200 && num<=350){
 num=num-200;
 System.out.println("$"+(500+num*10));
}
else if(num>350){
num=num-350;
System.out.println("$"+((500+1500)+(num*15)));
}
}
}