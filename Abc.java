import java.util.Scanner;
class Abc{
    public static void main(String[] args)
    {
      Scanner sc = new  Scanner(System.in) ;
      System.out.println("Enter the String") ;
      String con =  sc.nextLine();
      String nam = "";
      String a ="";
      String b = "";
      String c = "";
      String d ="";
      System.out.println("__________________________");
      for(int i=0;i<con.length();i++){
          a = String.valueOf(con.charAt(i));
          c = a+a;
          d=con.substring(i);
         System.out.println(a);
           if(a.equals(d)){
             continue;
           }
      for(int j=1;j<con.length();j++){
            b=a+con.charAt(j);
           if(c.equals(b)){
            continue;
           }
           else if(b.equals(d)){
             continue;
           }
           else if(a.equals(String.valueOf(con.charAt(con.length()-1)))) {
            break;
           }
            System.out.println(b);
          }
          d=con.substring(i);
         System.out.println(con.substring(i));
    }
    // System.out.println(con.charAt(con.length()-1));
}
}