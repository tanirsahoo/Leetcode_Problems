import java.util.*;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0] ;
        for(int i = 1 ; i < strs.length ; i ++){
            String newstr = "" ;
            int len = str.length() ;
            int len2 = strs[i].length() ;
            if(len <= len2) {
                for (int j = 0; j < len; j++) {
                    if (strs[i].charAt(j) == str.charAt(j))
                        newstr = newstr + str.charAt(j);
                    else
                        break ;
                }
            }
            else{
                for (int j = 0; j < len2; j++) {
                    if (strs[i].charAt(j) == str.charAt(j))
                        newstr = newstr + str.charAt(j);
                    else
                        break ;
                }
            }
            str = newstr ;
        }
        return str ;
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        String[] str = {"flower","fkow"} ;
        String result = ob.longestCommonPrefix(str) ;
        System.out.println("The result is: " + result);
        System.out.println("Hello World");
    }
}