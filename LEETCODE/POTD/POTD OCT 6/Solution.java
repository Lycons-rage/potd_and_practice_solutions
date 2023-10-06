class Solution {
    public int integerBreak(int n) {
        int[] mem = new int[n+1];
        mem[0] = 0;
        mem[1] = 0;
        mem[2] = 1;
        for(int num = 3; num <= n; num++){
            for(int i = 1; i<num; i++){
                int cmp = Math.max(mem[num-i], num-i);
                mem[num] = Math.max(mem[num], cmp*i);
            }
        }
        return mem[n];
    }
}