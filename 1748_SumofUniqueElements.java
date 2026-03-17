class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sum += nums[i];
            }
        }
        return sum;
    }
}

Examples :
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
