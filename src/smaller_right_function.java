public class smaller_right_function {
    public static int[] rightSmallerThan(int[] ar){
        int len = ar.length ;
        int[] arr = new int[len] ;
        for(int i = 0 ; i < len - 1 ; i ++){
            int count = 0 ;
            for(int j = i + 1 ; j < len ; j ++){
                if(ar[i] > ar[j])
                    count ++ ;
            }
            arr[i] = count ;
        }
        arr[len - 1] = 0 ;
        return arr;
    }
    public static void main(String[] args) {
        int[] ar = {8 , 5 , 11 , -1 , 3 , 4 , 2} ;
        int[] arr = rightSmallerThan(ar) ;
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
