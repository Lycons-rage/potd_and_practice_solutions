//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start = 0, end = n-1, mid = start+(end-start)/2;
        if(k > arr[end] || k < arr[start]){
          return -1;
        }
        for (int i = 0; i < n; i++){
          if (arr[mid] == k){
            return mid;
          }
          else if (arr[mid] > k){
            end = mid - 1;
            mid = start+(end-start)/2;
          }
          else{
            start = mid + 1;
            mid = start+(end-start)/2;
          }
        }
        return -1;
    }
}