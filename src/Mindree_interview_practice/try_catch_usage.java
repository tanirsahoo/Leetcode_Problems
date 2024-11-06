package Mindree_interview_practice;

import java.util.Scanner;

public class try_catch_usage {
    public static int testing(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n. ");
        int n = sc.nextInt() ;
        int k = 0 ;
        try{
            k = 20 / n ;
        }catch(Exception e){
            System.out.println("There is an exception in the code");
            return -1 ;
        }finally {
            System.out.println("This Line of code, didn't get executed.");
        }
        return k ;
    }

    public static void main(String[] args) {
        System.out.println("The Value of Testing is: " + testing()) ;
    }
}
