class Solution {
    public boolean isPalindrome(String s) {
        //cleaning up the string by removing any non-alphanumeric character as well as whitespaces
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.replaceAll(" ","");

        if (s.length() == 1 || s.isEmpty()){
            return true;
        }
        
        return recursiveHelper(s, 0);
    }

    static boolean recursiveHelper(String s, int i) {
        if ( i == (s.length()/2)+1){
            return true;
        }
        if ( s.charAt(i) == s.charAt(s.length()-i-1)){
            return recursiveHelper(s, i+1);
        }
        else{
            return false;
        }
    }
}