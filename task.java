
import java.util.Scanner;

class A {
    int a;
    int b;
}

class B {
    Scanner sc = new Scanner(System.in);
    A obj = new A();

    void input() {
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
    }

    A getobject() {
        return obj;
    }
}

class C {
    B object = new B();

    int add() {
        object.input(); 
        A aObj = object.getobject(); 
        return aObj.a + aObj.b;
    }
}

 class task {
    public static void main(String[] args) {
        C obj1 = new C();
        System.out.println("Sum is: " + obj1.add());
    }
}
