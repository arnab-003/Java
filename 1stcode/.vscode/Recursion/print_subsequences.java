public class print_subsequences {
    public static void subsequences(String str,int idx, String newstring){
        if(idx==str.length()){
            System.err.println(newstring);
            return;
        }
        char currChar=str.charAt(idx);

        subsequences(str, idx+1, newstring+currChar); // To be

        subsequences(str, idx+1, newstring); // not to be
    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str, 0,"");
    }
    
}



