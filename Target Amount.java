// Problem statement
// You are given three binary integers ‘X’, ‘Y’ and ‘Z’ which signifies the state of ‘1-dollar’, ‘2-dollar’ and ‘3-dollar’ coins.

// If ‘X’ is ‘1’, you have an infinite supply of ‘1-dollar’ coins, otherwise you have no ‘1-dollar’ coins.
// If ‘Y’ is ‘1’, you have an infinite supply of ‘2-dollar’ coins, otherwise you have no ‘2-dollar’ coins.
// If ‘Z’ is ‘1’, you have an infinite supply of ‘3-dollar’ coins, otherwise you have no ‘3-dollar’ coins.
// Additionally, you are given an integer ‘Target'. Your task is to determine whether it is possible to form the exact value of ‘Target’ dollar using the available coins.



// If it is possible to achieve a ‘Target’ amount, return ‘1’; otherwise, return ‘0’.



// Example:
// ‘X’ = 0
// ‘Y’ = 1
// ‘Z’ = 1
// ‘Target’ = 8

// Here, one of the possible ways is to take two ‘3-dollar’ coins and one ‘2-dollar’ coins.

// So, the answer for this example is ‘1’.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= 'T' <= 10
// 0 <= 'X', ‘Y’, ‘Z’ <= 1
// 1 <= ‘Target’ <= 10^9

// Time Limit: 1 sec 
// Sample Input 1:
// 2
// 0 1 1 7
// 0 0 1 8
// Sample Output 1:
// 1
// 0
// Explanation of sample input 1:
// For test case 1:

// The only possible way is to take two ‘2-dollar’ coins and one ‘3-dollar’ coin. So, the answer for this test case is ‘1’.

// For test case 2:

// It is impossible to achieve a target amount ‘8’ by using ‘3-dollar’ coins. So, the answer for this test case is ‘0’.
// Sample Input 2:
// 2
// 0 1 0 11
// 1 0 0 12
// Sample Output 2:
// 0
// 1
//----------------------------------------------------------------------------------------------------------------------------
//GCD Approach
public class Solution {
    public static int targetAmount(int x, int y, int z, int target) {
        // Write your code here
        if(x==1&&y==1&&z==1)
            return 1;
        if(x==1&&y==1)
            return 1;
        if(x==1&&z==1)
            return 1;
        if(y==1&&z==1)
        {
            if(target==1)
                return 0;
            else
                return 1;
        }

        if(y==1)
            return target%2==0 ? 1 : 0;
        if(z==1)
            return target%3==0 ? 1 : 0;
        if(x==1)
            return 1;
        
        return 0;

        
    }
}
