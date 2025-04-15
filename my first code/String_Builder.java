import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Arnab");
        System.out.println(sb);
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0,'B');
        // System.out.println(sb);
        sb.insert(0,'P');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.append(' ');
        sb.append('D');
        System.out.println(sb);
        sb.append('e');
        System.out.println(sb);
        sb.append('b');
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
    
}
