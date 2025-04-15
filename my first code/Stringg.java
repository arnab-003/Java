import java.util.*;
public class Stringg {
    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
    //    String name = sc.nextLine();

    //     System.out.println(name);
    //Concatination
    // String firstname="Arnab";
    // String lastname="Deb";
    // String fullname= firstname+" "+lastname;
    // System.out.println(fullname.length());
    // //CharAt
    // for(int i=0;i<fullname.length();i++){
    //     System.out.println(fullname.charAt(i));
    // }
    
    //compare
    String name1=sc.nextLine();
    String name2=sc.nextLine();

    if(name1.compareTo(name2)==0){
        System.out.println("Strings are equal");
    }else{
        System.out.println("Strings are not equal");
    }
    }
}
 