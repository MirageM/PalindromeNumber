class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reversed = 0;
        int current = x;
        while(current != 0){
            int digit = current % 10;
            reversed = 10*reversed + digit;
            current /= 10;
        }
        return reversed == x;
        
    }
}