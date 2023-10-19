class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> s_stack = new Stack<>();
        Stack<String> t_stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '#'){
                if(!s_stack.isEmpty()){
                    s_stack.pop();
                }
                else{
                    continue;
                }
            }
            else{
                s_stack.push(""+s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++){
            if (t.charAt(i) == '#'){
                if(!t_stack.isEmpty()){
                    t_stack.pop();
                }
                else{
                    continue;
                }
            }
            else{
                t_stack.push(""+t.charAt(i));
            }
        }

        if(s_stack.equals(t_stack) || (s_stack.empty()) && t_stack.empty()) {
            return true;
        }
        return false;
    }
}