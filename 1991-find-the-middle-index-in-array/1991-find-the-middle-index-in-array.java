class Solution {
    public int findMiddleIndex(int[] nums) {
        int Sum = 0;
        int leftsum = 0;
        for (int ele : nums)
            Sum += ele;
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            if (leftsum * 2 == Sum - nums[i])
                return i;
        return -1;      
    }
}