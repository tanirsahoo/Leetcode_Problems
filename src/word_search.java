public class word_search {
//    public static boolean search_in_progress(char[][] board , String word , int i , int j , int k){
//        if(k < board.length && board[i][j] == word.charAt(k)){
//            k ++ ;
//            if(i < board.length - 1) {
//                search_in_progress(board, word, i + 1, j, k);
//            }
//            if(j < board[0].length - 1) {
//                search_in_progress(board, word, i, j + 1, k);
//            }
//            if(i > 0 ) {
//                search_in_progress(board, word, i - 1, j, k);
//            }
//            if(j > 0){
//                search_in_progress(board, word, i, j - 1, k);
//            }
//            if(k != (word.length() - 1))
//                k = 0 ;
//        }
//        else if (k < (word.length() - 1)){
//            if(i < board.length - 1) {
//                search_in_progress(board, word, i + 1, j, k);
//            }
//            if(j < board[0].length - 1) {
//                search_in_progress(board, word, i, j + 1, k);
//            }
//        }
//        if(k == (word.length() - 1))
//            return true ;
//        else
//            return false ;
//    }
//    public boolean exist(char[][] board, String word) {
//
//        return true ;
//    }

    public static boolean check_word(char[][] board , String word , int i , int j , int k){
        if(board[i][j] == word.charAt(k)){
            if(k == (word.length() - 1))
                return true ;
            boolean[] ch = new boolean[4] ;
            if(i < board.length - 1) {
                ch[0] = check_word(board, word, i + 1, j, k + 1);
            }
            if(j < board[0].length - 1) {
                ch[1] = check_word(board, word, i, j + 1, k + 1);
            }
            if(i > 0 ) {
                ch[2] = check_word(board, word, i - 1, j, k + 1);
            }
            if(j > 0){
                ch[3] = check_word(board, word, i, j - 1, k + 1);
            }
            if(ch[0] == true || ch[1] == true || ch[2] == true || ch[3] == true)
                return true ;
            else
                return false ;
        }
        else
            return false ;
    }
    public static boolean exist(char[][] board, String word) {
            for(int i = 0 ; i < board.length ; i ++){
                for(int j = 0 ; j < board[0].length ; j ++){
                    boolean check = check_word(board , word , i , j , 0) ;
                    if(check == true)
                        return true ;
                }
        }
        return false ;
    }

    public static void main(String[] args) {
        char[][] ar = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}} ;
        String word = "DFCS" ;
        boolean result = exist(ar , word) ;
        System.out.println(result);
    }
}
