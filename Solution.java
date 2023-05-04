
public class Solution {
    public boolean isPalindrome(String s) {
        s = form(s);
        if (s.length() <= 1)
            return true;
        else if (s.length() == 2) {
            return s.charAt(0)==s.charAt(1);
        }else{
            return isPalindrome(s.substring(0,s.length()-1));
        }
    }
    public String form(String s ){
        s= s.toLowerCase();
        s= s.replaceAll("[^A-Za-z0-9]", "");
        return s;
    }
}
