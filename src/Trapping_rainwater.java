public class Trapping_rainwater {
    public int[] left_call(int[] height){
        int max = -1 ;
        int[] ar = new int[height.length] ;
        for(int i = 0 ; i < height.length ; i ++){
            if(height[i] > max) {
                max = height[i];
            }
            ar[i] = max ;
        }
        return ar ;
    }
    public int[] right_call(int[] height){
        int max = -1 ;
        int[] ar = new int[height.length] ;
        for(int i = height.length - 1 ; i >= 0 ; i --){
            if(height[i] > max){
                max = height[i] ;
            }
            ar[i] = max ;
        }
        return ar ;
    }
    public int trap(int[] height) {
        int[] left = left_call(height) ;
        int[] right = right_call(height) ;
        double sum = 0 ;
        for(int i = 0 ; i < height.length ; i ++){
            sum += Math.min(left[i] , right[i]) - height[i];
        }
        return (int)sum ;
    }
    public static void main(String[] args) {
        int[] ar = {4,2,0,3,2,5} ;
        Trapping_rainwater ob = new Trapping_rainwater() ;
        System.out.println("The Rainwater collected is: " + ob.trap(ar));
    }
}
