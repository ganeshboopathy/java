class Findprime {
    void myprime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}

class Prime {
    public static void main(String[] args) {
        Findprime obj = new Findprime();
        obj.myprime(7); // Output: 7 is a prime number
    }
}
