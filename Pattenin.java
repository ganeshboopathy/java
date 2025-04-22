class Pattenin{
    public static void main(String[] args){
        Patten1(5);
     System.out.println("--------------");
     System.out.println();
        Patten2(5);
     System.out.println("--------------");
     System.out.println();
        Patten3(5);
     System.out.println("--------------");
     System.out.println();
        Patten4(5);
     System.out.println("--------------");
     System.out.println();
        Patten5(5);
    System.out.println("--------------");
    System.out.println();
        Patten6(5);
    System.out.println("--------------");
    System.out.println();
        Patten7(5);
    System.out.println("--------------");
    System.out.println();
        Patten8(5);
    System.out.println("--------------");
    System.out.println();
        Patten9(5);

    }
     static void Patten1(int n) {
        for(int row =0;row<n;row++){
            for(int col = 0; col <= row; col++) {
              System.out.print(" *");
            }
            System.out.println();
        }
     }
    
     static void Patten2(int n){
        for(int row =0 ; row<=n;row++){
            for(int col=0;col<n;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
     }
     static void Patten3(int n){
        for(int row =1 ; row<=n;row++){
            for(int col=0;col<(n+1)-row;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
     }
    static void Patten4(int n){
        for(int row =1 ; row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
     }
      static void Patten5(int n){
        for(int row =1 ; row<=n*2;row++){
             int totalcol=  row>n?(n*2)-row:row;
            for(int col=1;col<=totalcol;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
     }
     static void Patten6(int n){
        for(int row =1 ; row<=n*2;row++){
             int totalcol=  row>n?(n*2)-row:row;
             for(int s=0; s<n-totalcol;s++){
                System.out.print(" ");
             }
            for(int col=1;col<=totalcol;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
     }
        static void Patten7(int n) {
        for(int row =0;row<n;row++){
            for(int col = 0; col <= row; col++) {
              System.out.print(row);
            }
            System.out.println();
        }
     }
      static void Patten8(int n) {
        for(int row =0;row<n;row++){
            for(int col = 0; col <= row; col++) {
           if(col==0||col==row){
            System.out.print(1);
           }
           else{
            System.out.print(row);
           }
              
            }
            System.out.println();
        }
     }
     static void Patten9(int n) {
    for (int row = 0; row < n; row++) {
        int val = 1;
        for (int col = 0; col <= row; col++) {
            System.out.print(val);
            val = val * (row - col) / (col + 1);
        }
        System.out.println();
    }
}

 }
