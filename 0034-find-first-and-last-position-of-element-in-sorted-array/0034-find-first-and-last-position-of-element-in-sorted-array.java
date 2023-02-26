class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int startIndex = search(nums, target, true);
        int lastIndex = search(nums, target, false);
        ans[0] = startIndex;
        ans[1] = lastIndex;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int l = 0, u = nums.length-1;
        while(l<=u){
            int mid = u+(l-u)/2;
            if(nums[mid]<target){
                l = mid+1;
            }
            else if(nums[mid]>target){
                u = mid-1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    u=mid-1;
                }
                else{
                l=mid+1;
                }
            }
        }
        return ans;
    }
}