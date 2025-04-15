import java.util.*;
// public class Functions {
    
//         public static void printMyName(String name){
//             System.out.println(name);
//             return;
//         }
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();

//         printMyName(name);//call the function
//     }
// }

//add two numbers
public class Functions {
    
    public static int addTwoNumbers(int a , int b){
        int sum = a+b;
        return sum ;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum=addTwoNumbers(a,b);
    System.out.println(sum);
   }
}

//multiply of two numbers

// public class Functions {
    
//     public static float mulTwoNum(float a , float b){
//         float mul = a*b;
//         return mul ;
//     }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     float a=sc.nextInt();
//     float b=sc.nextInt();

//     float mul=mulTwoNum(a,b);
//     System.out.println(mul);
//    }
// }

//find factorial number

public class Functions {
    
    public static void findFactorial(int n){
       int factorial=1;
       for(int i=n;i>=1;i--){
        factorial=factorial*i;
       }
        System.out.println(factorial);
        return;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    // int factorial=findFactorial(n);
    // System.out.println(factorial);
    findFactorial(n);
   }
}