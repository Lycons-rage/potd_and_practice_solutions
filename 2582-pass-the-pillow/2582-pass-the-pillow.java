class Solution {
    public int passThePillow(int n, int time) {
        int current = 1, direction = 0;

        for (int i = 0; i < time; i++) {
            if(current == n){
                direction = -1;
            }
            if(current == 1){
                direction = 1;
            }
            current = current+direction;
        }

        return current;
    }
}