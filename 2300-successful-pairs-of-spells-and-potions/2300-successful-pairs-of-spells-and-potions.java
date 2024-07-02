class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int count = 0;
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        int p1 = 0, p2 = potions.length-1;

        for (int i = 0; i < spells.length; i++) {
            if(((long) potions[p2] * spells[i]) < success){
                ans[i] = 0;
            } else {
                while(((long)spells[i]*potions[p1]) < success){
                    p1++;
                }
                ans[i] = p2-p1+1;
                p1 = 0;
            }
        }
        return ans;
    }
}