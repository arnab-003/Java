import java.util.*;
public class Print_Subsets {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
 
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);

            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
    
}
// Time complexity = O(2^n)
