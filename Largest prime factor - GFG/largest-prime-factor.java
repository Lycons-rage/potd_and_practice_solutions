//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
    int result = 0, number = N, i, flag=0;
        for (i = 2; i<=N; i++){
            if (N%i==0 && isprime(i)==true){
                N=N/i;
                flag=1;
                if( i>result ) {
                    result = i;
                }
            }
        }
        if(flag==0){
            return N;
        }
            return result;
    }

    static boolean isprime(int i) {
        for (int j = 2; j<=i/2; j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}