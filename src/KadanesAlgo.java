public class KadanesAlgo {
    public int maxSubArray(int[] nums) {
        int max = nums[0] , sum = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            sum = sum + nums[i] ;
            max = Math.max(max , sum) ;
            if(sum < 0)
                sum = 0 ;
        }
        return max ;
    }
    public static void main(String[] args) {
        KadanesAlgo ob = new KadanesAlgo() ;
        int[] ar = {-2,1,-3,4,-1,2,1,-5,4} ;
        System.out.println("The largest sum is: " + ob.maxSubArray(ar));
    }
}
