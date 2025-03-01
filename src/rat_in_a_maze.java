import java.util.*;

public class rat_in_a_maze {

    public boolean issafe(ArrayList<ArrayList<Integer>> ar , int x , int y , int[][] visited , int n){
        if((x >= 0 && x < n) && (y >= 0 && y < n))
        {
            if(visited[x][y] == 0 && ar.get(x).get(y) == 1)
                return true ;
        }
        return false ;
    }
    public ArrayList<String> solve(ArrayList<ArrayList<Integer>> ar , int n , ArrayList<String> ans , int[][] visited , String path , int x , int y){
        if(ar.get(x).get(y) == 0)
            return ans ;
        if(x == n - 1 && y == n - 1){
            ans.add(path) ;
        }
        else {
            visited[x][y] = 1 ;
            if (issafe(ar, x + 1, y, visited, n)) {
                solve(ar, n, ans, visited, path + "D", x + 1, y);
            }
            if (issafe(ar, x, y - 1, visited, n)) {
                solve(ar, n, ans, visited, path + "L", x, y - 1);
            }
            if (issafe(ar, x, y + 1, visited, n)) {
                solve(ar, n, ans, visited, path + "R", x, y + 1);
            }
            if (issafe(ar, x - 1, y, visited, n)) {
                solve(ar, n, ans, visited, path + "U", x - 1, y);
            }
            visited[x][y] = 0;
        }
        return ans ;
    }

    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> ar){
        int n = ar.get(0).size() ;
        ArrayList<String> ans = new ArrayList<>() ;
        int[][] visited = new int[n][n] ;
        String path = "" ;
        return solve(ar , n , ans , visited , path , 0 , 0) ;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>() ;
        ar.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        ar.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        ar.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0)));
        ar.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        rat_in_a_maze ob = new rat_in_a_maze() ;
        List<String> arr = ob.findPath(ar) ;
    }
}
