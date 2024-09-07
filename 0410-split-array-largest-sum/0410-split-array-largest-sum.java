class Solution {
    public int splitArray(int[] nums, int k) {
        return bookAllocation(nums, k);
    }
    
        private static int bookAllocation(int[] pages, int students) {
        if(students > pages.length){
            return -1;
        }

        int low = Integer.MIN_VALUE, high = 0, ans = -1;
        // assigning low as max(pages) and high as sum(pages)
        for (int page : pages) {
            if(page > low){
                low = page;
            }
            high = high + page;
        }

        //binary search
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = countStudent(pages, mid);

            if(count > students){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countStudent (int[] pages, int threshold){
        int student = 1, student_pages = 0;

        for (int page : pages){
            if(student_pages + page <= threshold){
                student_pages += page;
            } else {
                student++;
                student_pages = page;
            }
        }

        return student;
    }
}