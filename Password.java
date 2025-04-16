import java.util.Scanner;

class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        boolean atoz = false;
        boolean AtoZ = false;
        boolean num = false;
        boolean special = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >='a' && ch <= 'z') {
                    atoz = true;
                } else if (ch >= 'A' && ch <= 'Z') {
                    AtoZ = true;
                } else if (ch >= '0' && ch <= '9') {
                    num = true;
                } else if (
                    ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
                    ch == '%' || ch == '^' || ch == '&' || ch == '*'
                ) {
                    special = true;
                }
            }

            if (atoz && AtoZ && num && special) {
                System.out.println("Password is valid");
            }
            else if(!atoz){
                System.out.println("Password should have at least one lowercase letter");
            }
            else if(!AtoZ){
                System.out.println("Password should have at least one Uppercase letter");
            }
            else if(!num){
                System.out.println("Password should have at least one  number");
            }
            else if(!special){
                System.out.println("Password should have at least one  Symbol");
            }
             else {
                System.out.println("Password is not valid give cap,sam,syb,num");
            }
        } else {
            System.out.println("Password length should be more than 8");
        }

        sc.close();
    }
}
