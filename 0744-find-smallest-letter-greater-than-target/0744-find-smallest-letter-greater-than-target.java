class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, u = letters.length-1; 
        
        while(l<=u){
            int mid = u+(l-u)/2;
            if(target < letters[mid]){
                u = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
    return letters[l%letters.length];
    }
}