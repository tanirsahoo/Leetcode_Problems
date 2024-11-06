import java.util.* ;
public class Anagram {
    public static HashMap<Character , Integer> anagram(String str){
        HashMap<Character , Integer> hp = new HashMap<>() ;
        int val = 0 ;
        for(int i = 0 ; i < str.length() ; i ++){
            if(hp.containsKey(str.charAt(i))) {
                val = hp.get(str.charAt(i));
                hp.put(str.charAt(i), (val + 1));
            }
            else{
                hp.put(str.charAt(i) , 1) ;
            }
        }
        return hp ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str1 = sc.nextLine() ;
        String str2 = sc.nextLine() ;
        HashMap<Character , Integer> hp1 = anagram(str1) ;
        HashMap<Character , Integer> hp2 = anagram(str2) ;
        if(hp1.equals(hp2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
