import java.util.*;

public class greaterless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Both are same number");
        }
        else if(a>b){
            System.out.println("a greater than b");
        }
        else{
            System.out.println("a less than b");
        }
}
}
