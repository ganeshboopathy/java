 class PatternPrinter {
    public static void main(String[] args) {
        String word = "ganesh";
        int length = word.length();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" "+"");
            }
            System.out.println(word.substring(0, i));
        }
    }
}
