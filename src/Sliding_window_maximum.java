import java.util.LinkedList;

import java.util.* ;

public class Sliding_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        int[] ar = new int[nums.length - k + 1] ;
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            pq.offer(nums[i]) ;
            if(i >= k - 1){
                ar[j ++] = pq.peek() ;
                pq.remove(nums[i - k + 1]) ;
            }
        }
        return ar ;
    }
    public static void main(String[] args) {
        int[] ar = {1,3,-1,-3,5,3,6,7} ;
        Sliding_window_maximum ob = new Sliding_window_maximum() ;
        System.out.println("The max arrays are: " + ob.maxSlidingWindow(ar , 3));
    }
}
