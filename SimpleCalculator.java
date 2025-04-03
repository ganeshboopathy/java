import java.util.Scanner;

class SimpleCalculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    double num = sc.nextDouble();
    System.out.println("enter the second number :");
    double num2 = sc.nextDouble();
    double result = 0;
    boolean validOperation = true;
    System.out.println("Choose an operation (+, -, *, /): ");
    char operation = sc.next().charAt(0);
    switch (operation)
     {
        case'+':
        result = num + num2;
        break;
        case'-':
        result = num-num2;
        break;
        case '*':
        result = num*num2;
        break;
        case '/':
        result = num/num2;
        break;
        default :
        System.out.println("Invalid operation");
        validOperation = false;
     }
     if(validOperation){
        System.out.println("Result: " + result);
     }
    }
}