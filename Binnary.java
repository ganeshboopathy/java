import java.util.Scanner;

class Decimal {

    String convertToBinary(int a) {
        String b= "";
        String c="";
        String d="";
        while (a > 0) {
            b+= a % 2;
            a = a / 2;
        }
        
        for(int i= b.length() - 1;i>=0;i--){
            c +=b.charAt(i);
        }
        if(c.length()<=4){
            for(int i=c.length();i<=3;i++){
                d+='0';
            }
        }
        return d+c;
    }
}

class Binnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        Decimal decimal = new Decimal();
        String binaryResult = decimal.convertToBinary(number);

        System.out.println("Binary: " + binaryResult);
    }
}
