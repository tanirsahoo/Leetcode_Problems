import java.util.*;
public class insert_elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        LinkedList<Integer> ar = new LinkedList<>() ;
        for(int i = 0 ; i < n ; i ++){
            int itm = sc.nextInt() ;
            ar.add(itm) ;
        }
        int index = sc.nextInt() ;
        int elem = sc.nextInt() ;
        if(index != 0 && elem != 0)
        ar.add(index - 1 , elem);
        System.out.println("Element after insertion is");
        for(int item : ar){
            System.out.println(item);
        }
    }
}
