import java.util.* ;

public class NQueen {
    public boolean isSafe(int[][] validate, int x, int y, int n) {
        // Check column
        for (int i = x; i < n; i++) {
            if (validate[i][y] == 1)
                return false;
        }
        //check row
        for(int i = y ; i >= 0 ; i --){
            if(validate[x][i] == 1)
                return false ;
        }
        // Check upper-left diagonal
        for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
            if (validate[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = x, j = y; i < n && j >= 0; i++, j--) {
            if (validate[i][j] == 1)
                return false;
        }

        return true;
    }

    public void addSolution(List<List<String>> ar, int[][] validate, int n) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(validate[i][j] == 1 ? "Q" : ".");
            }
            temp.add(row.toString());
        }
        ar.add(temp); // Store the board configuration
    }

    public void solve(List<List<String>> ar, int[][] validate, int n, int col) {
        if (col == n) { // If all queens are placed
            addSolution(ar, validate, n);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(validate, row, col, n)) {
                validate[row][col] = 1; // Place the queen

                solve(ar, validate, n, col + 1); // Recurse for next column

                validate[row][col] = 0; // Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] validate = new int[n][n]; // Chessboard
        List<List<String>> ans = new ArrayList<>();
        solve(ans, validate, n, 0);
        return ans;
    }
    public static void main(String[] args) {
        NQueen solver = new NQueen();
        int n = 15;
        List<List<String>> solutions = solver.solveNQueens(n);
        for(List<String> item : solutions){
            for(String itm : item){
                System.out.println(itm);
            }
            System.out.println();
        }
        }
}
