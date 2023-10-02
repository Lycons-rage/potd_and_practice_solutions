class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < word.length; i++){
            str.append(word[i]);
            str.reverse();
            word[i] = str.toString();
            str.delete(0,str.length());
            if(ans.isEmpty()){
                ans.append(word[i]);
            }
            else{
                ans.append(" "+word[i]);
            }
        }

        return ans.toString();
    }
}