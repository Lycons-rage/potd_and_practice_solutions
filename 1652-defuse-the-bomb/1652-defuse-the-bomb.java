class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            return new int[code.length];
        }
        int[] ans = new int[code.length];
        int sum = 0;

        for (int i = 0; i < code.length; i++) {
            for (int j = 1; j <= Math.abs(k); j++) {
                if(k>0){
                    sum = sum + code[(i + j) % code.length];
                }
                if (k < 0) {
                    int index = (i-j)%code.length;
                    if(index<0){
                        index = code.length+index;
                    }
                    sum = sum + code[index];
                }
            }
            ans[i] = sum;
            sum=0;
        }
        return ans;
    }
}