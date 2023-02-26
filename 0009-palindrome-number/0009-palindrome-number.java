class Solution {
    public boolean isPalindrome(int x) {
        int t = x;
        int rev = 0;
        while(t>0){
            int digit = t%10;
            rev = rev*10+digit;
            t/=10;
        }
        if(rev == x) return true;
        else return false;
    }
}