class Solution {
    public int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s+$", "");

        return s.substring(s.lastIndexOf(" ")+1, s.length()).length();
    }
}