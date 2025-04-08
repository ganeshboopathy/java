import java.util.Scanner;

class Mymark{
    void score(int num){
        if(num>=90 && num<=100){
            System.out.println("grade A");
        }
        else if(num>=80 && num<90){
            System.out.println("grade B");
        }
        else if(num>=60 && num<80){
            System.out.println("grade c");
        }
        else if(num>=35  && num<60){
            System.out.println("grade D");
        }
        else{
            System.out.println("Faile");
        }
    }
}
class Mark{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    Mymark obj = new Mymark();
     obj.score(c);
    }
}