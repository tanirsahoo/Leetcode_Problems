import java.lang.reflect.Array;
import java.util.*;

public class Skyline_problem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ar = new ArrayList<List<Integer>>() ;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        int a = buildings[0][0] , b = buildings[0][1] , length = buildings.length , j = 1;
        pq.add(buildings[0][2]) ;
        int max_height = pq.peek() ;
        ar.add(Arrays.asList(a , max_height)) ;
        for(int i = a + 1 ; i <= b ; i ++){
            if(i > buildings[j][0]){
                if(max_height < buildings[j][2]){
                    pq.add(buildings[j][2]) ;
                    max_height = pq.peek() ;
                    ar.add(Arrays.asList(i , max_height)) ;
                }
                i = buildings[j][0] ;
            }
            else if(i == buildings[j][0]){
                if(max_height < buildings[j][2]){
                    if(){}
                    pq.add(buildings[j][2]) ;
                    max_height = pq.peek() ;
                }
            }
            else{
                continue;
            }
        }
        return ar ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int ar[][] = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        Skyline_problem ob = new Skyline_problem() ;
        List<List<Integer>> arr = ob.getSkyline(ar) ;
//        for (List<Integer> item:arr) {
//            for (Integer itm:item){
//                System.out.print(itm + " ");
//            }
//            System.out.println();
//        }
        for(int i = 0 ; i < ar.length ; i ++){
            for(int j = 0 ; j < 3 ; j ++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Length of the List: " + ar.length);
        System.out.println("Hello World");
    }
}
