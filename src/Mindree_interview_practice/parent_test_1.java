package Mindree_interview_practice;

interface working{
    public int salary(int a, double b) ;
    public boolean is_able(double marks) ;
}

abstract class working_new{
    public static int testing(int a , int b){
        return a + b ;
    }
    protected void new_work(int a){
        System.out.println("The Number is: " + a);
    }
    abstract protected int pri_function(boolean gg) ;
}

public class parent_test_1 extends working_new implements working{
    int a , b ;
    parent_test_1(){
        System.out.println("Default Constructor");
    }
    parent_test_1(int a , int b){
        this.a = a ;
        this.b = b ;
    }
    protected int pri_function(boolean gg){
        if(gg == true)
            return 1 ;
        else
            return 0 ;
    }
    public int salary(int a, double b){
        return (int)(a + b) ;
    }
    public boolean is_able(double marks){
        if(marks > 60)
            return true ;
        else
            return false ;
    }
    public static final int fibonacci(int n){
        if(n == 1 )
            return 0 ;
        else if(n == 2)
            return 1 ;
        else{
            return fibonacci(n - 1) + fibonacci(n - 2) ;
        }
    }
    public boolean palindrome(int n){
        int p = 0 , num = n ;
        while(num > 0){
            int k = num % 10 ;
            num = num / 10 ;
            p = p * 10 + k ;
        }
        if(p == n)
            return true ;
        else
            return false ;
    }
    public static void main(String[] args) {
        parent_test_1 ob = new parent_test_1() ;
        System.out.println(fibonacci(5));
        System.out.println("Is Palindrome1: " + ob.palindrome(585));
    }
}

class child_test_1 extends parent_test_1{
    child_test_1(){
        super(5 , 10) ;
    }
    child_test_1(int a , int b){
        super(a , b) ;
    }
    public boolean palindrome(int n){
        return false ;
    }
    public static void main(String[] args) {
        child_test_1 ob = new child_test_1() ;
        parent_test_1 ob_new = new parent_test_1() ;
        System.out.println("Is Palindrome2: " + ob.palindrome(101));
        System.out.println("Of Parent, a is: " + ob_new.a);
        System.out.println("Of Parent, b is: " + ob_new.b);
    }
}

