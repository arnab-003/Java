public class Half_Pyramid_Pattren {
    public static void main(String[] args) {
        // int n=4;

        // //Outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        
        // System.out.println();
        // }
        // int n=4;

        // //Outer loop
        // for(int i=n;i>=1;i--){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        
        // System.out.println();
        // }
        // int n=4;

        // //Outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //     }
        //     System.out.println();

        // }
        // int n=5;

        // //Outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        
        // System.out.println();
        // }
        // int n=5;

        // //Outer loop
        // for(int i=n;i>=1;i--){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        
        // System.out.println();
        // }

        // Floyd's Triangle
        // int n=5;
        // int number=1;
        // //Outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++; 
        //     }
        
        // System.out.println();
        // }
        int n=5;
        //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
        
        System.out.println();
        }
    }
}
