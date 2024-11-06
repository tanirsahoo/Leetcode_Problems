import java.util.PriorityQueue;

public class instring {
//    public static String convertToTitle(int columnNumber) {
//        int depth = 0 , p;
//        String str = "" ;
//        while(columnNumber > 26){
//            p = columnNumber % 26 ;
//            columnNumber = columnNumber / 26 ;
//            if(p == 0) {
//                str += (char) (90);
//                columnNumber -- ;
//            }
//            else
//                str += (char)(65 + p - 1) ;
//        }
//        str += (char)(65 + columnNumber - 1) ;
//        String new_str = "" ;
//        for(int i = str.length() - 1 ; i >= 0 ; i --){
//            new_str += str.charAt(i) ;
//        }
//        return new_str ;
//    }
    public static int titleToNumber(String columnTitle) {
        int val = 0 ;
        for(int i = 0 ; i < columnTitle.length() - 1 ; i ++){
            int p = columnTitle.charAt(i) - 65 + 1;
            val = val + (p * 26) ;
        }
        int p = columnTitle.charAt(columnTitle.length() - 1) - 65 + 1 ;
        val = val + p ;
        return val ;
    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
