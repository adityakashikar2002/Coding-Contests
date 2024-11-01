// Problem statement
// You are given the arrays 'A' and 'B', each having 'N' integers numbered from '0' to 'N - 1'.



// Let's call the array 'B' good if for each index 'i' from '1' to 'N - 1', 'A[i] - A[i - 1]' is equal to 'B[i] - B[i - 1]'.



// Your task is to determine whether it is possible to make the array 'B' good by rearranging the elements of it. Return '1' if the array 'B' can be good and return '0', otherwise.

// Example:
// N = 4
// A = [2, 1, 2, 3]
// B = [4, 4, 5, 3]
// You can have the array 'B' equal to ['4', '3', '4', '5'] which is good.
// So, the answer for this case is '1'.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= 'T' <= 10
// 2 <= 'N' <= 10^5
// 1 <= 'A[i]', 'B[i]' <= 10^5

// Time limit: 1 sec
// Sample input 1:
// 2
// 2
// 1 1
// 2 2
// 3
// 1 4 2
// 1 2 3
// Sample output 1:
// 1
// 0
// Explanation of sample input 1:
// For test case 1:
// You can see that the array 'B' is already good.
// So, the answer for this case is '1'.

// For test case 2:
// It can be proved that you can not make the array 'B' good by rearranging the elements of it.
// So, the answer for this case is '0'.
// Sample input 2:
// 2
// 4
// 1 2 3 4
// 8 9 10 9
// 5
// 2 6 2 7 3
// 5 1 2 1 6
// Sample output 2:
// 0
// 1

import java.util.Arrays;
public class Solution {
    public static int isArrayGood(int n, int[] a, int[] b) {
        // Write your code here
        Arrays.sort(a);
        Arrays.sort(b);
        boolean flag=true;
        for(int i=1;i<n;i++)
        {
            if(a[i]-a[i-1]!=b[i]-b[i-1])
            {
                flag=false;
                break;
            } 

        }
        return flag ? 1 : 0;
    }
}
