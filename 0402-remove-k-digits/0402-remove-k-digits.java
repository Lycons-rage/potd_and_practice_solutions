class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        int lim = k;
        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));

        // what we are doing inside the loop is
        // 1. first character of the string is pushed into the stack beforehand, then we took single char from the left
        // 2. if character less than stack-top, pop stack-top and push the character
        // 3. limiter--
        for (int i = 1; i < num.length(); i++) {
            char digit = num.charAt(i);
            while(!stack.isEmpty() && lim>0 && digit< stack.peek()){
                stack.pop();
                lim--;
            }
            stack.push(digit);
        }

        StringBuilder sb = new StringBuilder();
        // still if the size of stack is greater than desired output size we can now easily remove chars from the right
        // why? do a dry run and you'll see
        while(stack.size() > num.length()-k){
            stack.pop();
        }

        //converting stack to string builder
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }

        // handling leading 0s
        while(!sb.isEmpty() && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return (sb.isEmpty())?"0":sb.toString();
    }
}