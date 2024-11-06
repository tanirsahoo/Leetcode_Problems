import java.util.HashMap;
import java.util.Scanner;

public class TournamentWinner_Program {
    public static String tournamentWinner(String ar[][] , int win[]){
        HashMap<String , Integer> hp = new HashMap<>() ;
        int len = win.length ;
        String winner = "" ;
        for(int i = 0 ; i < len ; i ++){
            if(win[i] == 0){
                if(hp.get(ar[i][1]) == null){
                    hp.put(ar[i][1] , 3) ;
                }
                else{
                    hp.put(ar[i][1] , (hp.get(ar[i][1]) + 3)) ;
                }
            }
            else{
                if(hp.get(ar[i][0]) == null){
                    hp.put(ar[i][0] , 3) ;
                }
                else{
                    hp.put(ar[i][0] , (hp.get(ar[i][0]) + 3)) ;
                }
            }
        }
        int ln = len ;
        len = 0 ;
        int max = 0 ;
        while(ln > 0){
            if((hp.get(ar[len][0]) != null) && (hp.get(ar[len][0]) > max)){
                max = hp.get(ar[len][0]) ;
                winner = ar[len][0] ;
                hp.remove(ar[len][0]) ;
            }
            len ++ ;
            ln -- ;
        }
        return winner;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        String[][] arr = {{"HTML" , "Java"},{"Java" , "Python"},{"Python" , "HTML"},{"C#" , "Python"},{"Java" , "C#"},{"C#" , "HTML"}} ;
        int[] ar = {0 , 1 , 1 , 1 , 0 , 1} ;
//        String[][] arr = {{"HTML" , "C#"} , {"C#" , "Python"} , {"Python" , "HTML"}} ;
//        int[] ar = {0 , 0 , 1} ;
        String winner = tournamentWinner(arr , ar) ;
        System.out.println("The Winner is: " + winner);
    }
}
