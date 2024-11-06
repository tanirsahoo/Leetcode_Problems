import java.util.ArrayList ;
class Climb_stairs {
    static ArrayList<Integer> ar = new ArrayList<>() ;
    int nc = 0 ;
    static public int climbStairs(int n) {
        try{
            if(n == 1){
                if(ar.isEmpty())
                    ar.add(1) ;
                return 1 ;
            }
            else if(n == 2){
                if(ar.size() == 1)
                    ar.add(2) ;
                return 2 ;
            }
            else if(ar.get(n - 1) != null)
                return ar.get(n - 1) ;
            else{
                ar.add(climbStairs(n - 2) + climbStairs(n - 1)) ;
                return ar.get(n - 1) ;
            }
        }
        catch(Exception e){
            ar.add(climbStairs(n - 2) + climbStairs(n - 1)) ;
            return ar.get(n - 1) ;
        }
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}