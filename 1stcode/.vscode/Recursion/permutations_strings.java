public class permutations_strings {
    public static void printPermutations(String str , String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char currChar=str.charAt(i);
            //abc-> ab
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutations(str, "");
    }
}
// Time complexity-> O(n!)
