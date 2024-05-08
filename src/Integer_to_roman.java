import java.util.HashMap;
import java.util.Scanner;

public class Integer_to_roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        HashMap<Integer,Character> hs = new HashMap<Integer,Character>() ;
        hs.put(1,'I') ;
        hs.put(5,'V') ;
        hs.put(10,'X') ;
        hs.put(50,'L') ;
        hs.put(100,'C') ;
        hs.put(500,'D') ;
        hs.put(1000,'M') ;
        System.out.println("Enter the Number you want to convert.");
        int n = sc.nextInt() ;
        int num = n , count = 1;
        String roman = "" ;
        while((num / 10 != 0) || (num % 10 != 0)){
            int p = num % 10 ;
            if((p == 4 || p == 9)){
                String alt = "" ;
                int check = ((p == 4)? 5 : 10) * count ;
                p = p * count ;
                alt = alt + hs.get(check - p) + hs.get(check);
                roman = alt + roman ;
                count = count * 10 ;
            }
            else if((p == 1 || p == 2 || p == 3 || p == 0 || p == 5 || p == 6 || p == 7 || p == 8) ){
                String alt = "" ;
                if(p < 5){
                    while(p -- != 0){
                        alt += hs.get(count) ;
                    }
                }
                else{
                    p = p - 5 ;
                    alt += hs.get(5 * count) ;
                    while(p -- != 0){
                        alt += hs.get(count) ;
                    }
                }
                roman = alt + roman ;
                count = count * 10 ;
            }
            num = num / 10 ;
        }
        System.out.println("The Roman Equivalent is: " + roman);
    }
}
