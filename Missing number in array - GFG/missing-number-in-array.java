//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int i = 0, sum = 0;
        while (i<array.length){
            sum = sum+array[i];
            i++;
        }
        if (sum != n*(n+1)/2){
            return ((n*(n+1)/2)-sum);
        }
        return n;
    }
}