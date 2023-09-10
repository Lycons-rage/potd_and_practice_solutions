class Solution {
    public int[] rearrangeArray(int[] nums) {
        Stack<Integer> positivestack = new Stack<>();
        Stack<Integer> negativestack = new Stack<>();
        for (int i=0; i< nums.length; i++){
            if(nums[i] > 0){
                positivestack.push(nums[i]);
            }
            else{
                negativestack.push(nums[i]);
            }
        }

        for(int i = nums.length-1; i>=0; i--){
            if(i%2==0){
                nums[i] = positivestack.pop();
            }
            else{
                nums[i] = negativestack.pop();
            }
        }

        return nums;
    }
}

//OPTIMAL APPROACH

	//int n = A.size();  here A itself is an ArrayList

        // Define array for storing the ans separately.
        //ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        //int posIndex = 0, negIndex = 1;
        //for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            //if (A.get(i) < 0) {
                //ans.set(negIndex, A.get(i));
                //negIndex += 2;
            //}

            // Fill positive elements in even indices and inc by 2.
            //else {
                //ans.set(posIndex, A.get(i));
                //posIndex += 2;
            //}
        //}

        //return ans;

