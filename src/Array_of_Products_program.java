public class Array_of_Products_program {
    public static int[] arrayOfProducts(int[] ar){
        int len = ar.length ;
        int prod = 1 ;
        int[] arr = new int[len] ;
        for(int i = 0 ; i < len ; i ++){
            prod = prod * ar[i] ;
        }
        for(int i = 0 ; i < len ; i ++){
            arr[i] = prod / ar[i] ;
        }
        return arr ;
    }

    public static void main(String[] args) {
        int[] ar = {5 , 1 , 4 , 2} ;
        int[] res = arrayOfProducts(ar) ;
        for(int item:res){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
