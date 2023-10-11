class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        return helperRecursive(num, count);
    }

    static int helperRecursive(int n, int count) {

        if(n == 0){
            return count;
        }
        if (n % 2 != 0){
            count++;
            return helperRecursive(n-1, count);
        }
        else{
            count++;
            return helperRecursive(n/2,count);
        }
    }
}