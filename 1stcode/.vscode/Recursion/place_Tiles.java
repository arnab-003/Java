public class place_Tiles {
    public static int placeTiles(int n, int m){
        {
            if(n==m){
                return 2;
            }
            if(n<m){
                return 1 ;
            }
        }
        int vertPlacements = placeTiles(n-m,m);

        int horPlacements = placeTiles(n-1,m);

        return vertPlacements+horPlacements;
    }
    public static void main(String[] args) {
        int n=4, m=2;
       int Totaltiles=placeTiles(n, m);
        System.out.println(Totaltiles);

    }
    
}
