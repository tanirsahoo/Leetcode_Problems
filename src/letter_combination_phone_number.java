import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class letter_combination_phone_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number");
        String digits = sc.nextLine() ;
        HashMap<Character,String> hs = new HashMap<>() ;
        hs.put('2',"abc") ;
        hs.put('3',"def") ;
        hs.put('4',"ghi") ;
        hs.put('5',"jkl") ;
        hs.put('6',"mno") ;
        hs.put('7',"pqrs") ;
        hs.put('8',"tuv") ;
        hs.put('9',"wxyz") ;
        ArrayList<String> ar = new ArrayList<>() ;
        String cpy = digits ;
        int combination = 1 , i = 0 ;
        while(cpy.isEmpty()){
            if(cpy.charAt(i) == '7' || cpy.charAt(i) == '9'){
                combination *= 4 ;
            }
            else {
                combination *= 3 ;
            }
            i ++ ;
        }
    }
}
