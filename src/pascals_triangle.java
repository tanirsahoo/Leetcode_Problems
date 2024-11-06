import java.util.ArrayList;
import java.util.List;

class pascals_triangle {
    static List<List<Integer>> ar = new ArrayList<>() ;
//    static public List<List<Integer>> generate(int numRows) {
//        if(numRows == 1){
//            List<Integer> arr = new ArrayList<>(1) ;
//            arr.add(1) ;
//            ar.add(arr) ;
//            return ar ;
//        }
//        else{
//            List<Integer> arr = new ArrayList<>(numRows) ;
//            List<List<Integer>> a = generate(numRows - 1) ;
//            for(int i = 0 ; i < numRows - 1 ; i ++){
//                if(i == 0)
//                    arr.add(1) ;
//                else
//                    arr.add(a.get(numRows - 2).get(i) + a.get(numRows - 2).get(i - 1)) ;
//            }
//            arr.add(1) ;
//            ar.add(arr) ;
//            return ar ;
//        }
//    }
    static public List<Integer> getRow(int rowIndex) {
        //rowIndex = rowIndex + 1 ;
        if(rowIndex == 0){
            List<Integer> arr = new ArrayList<>(1) ;
            arr.add(1) ;
            ar.add(arr) ;
        }
        else{
            List<Integer> arr = new ArrayList<>(rowIndex) ;
            if(rowIndex != 0)
                getRow(rowIndex - 1) ;
            List<List<Integer>> a = ar;
            for(int i = 0 ; i < rowIndex ; i ++){
                if(i == 0)
                    arr.add(1) ;
                else
                    arr.add(a.get(rowIndex - 1).get(i) + a.get(rowIndex - 1).get(i - 1)) ;
            }
            arr.add(1) ;
            ar.add(arr) ;
        }
        return ar.get(rowIndex) ;
    }

    public static void main(String[] args) {
        getRow(3) ;
    }
}