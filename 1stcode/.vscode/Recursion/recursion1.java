// public class recursion1 {
//     public static void printNumb(int n){
//         if (n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         printNumb(n);
//     }
// }

public class recursion1 {
    public static void printSum( int i , int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
