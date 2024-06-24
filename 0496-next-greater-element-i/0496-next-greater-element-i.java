class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        map.put(nums2[nums2.length-1], -1);
        stack.push(nums2[nums2.length-1]);

        for (int i = nums2.length-2; i > -1; i--) {
            if(nums2[i] > stack.peek()){
                while(stack.peek() < nums2[i]){
                    stack.pop();
                    if(stack.isEmpty()){
                        map.put(nums2[i], -1);
                        stack.push(nums2[i]);
                        break;
                    }
                }
            }
            if(stack.peek() > nums2[i]) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            }
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}