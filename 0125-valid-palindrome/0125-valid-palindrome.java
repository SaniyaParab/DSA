class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String result = "";
        String rev = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9')) {

                result = result + ch;
            }
        }

        for(int i = result.length() - 1; i >= 0; i--) {
            rev = rev + result.charAt(i);
        }

        if(rev.equals(result)) {
            return true;
        }

        return false;
    }
}