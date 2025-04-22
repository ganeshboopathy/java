class ReverseString{
    public static void main(String[] args){
        String input = "Hello, World!";
        String a ="";
        for(int i=input.length()-1;i>=0;i--){
         a+= input.charAt(i);
        }
        System.out.println(a);
    }
}