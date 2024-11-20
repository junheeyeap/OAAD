class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> elements = new HashSet<>();
        long result = 0;
        long sum = 0;

        for (int i = 0; i < nums.length; i += 1) {
            sum += nums[i];
            
            while (!elements.add(nums[i])) {
                sum -= nums[i - elements.size()];
                elements.remove(nums[i - elements.size()]);
            }
            
            if (elements.size() > k) {
                sum -= nums[i - k];
                elements.remove(nums[i - k]);
            }

            if (elements.size() == k) {
                result = Math.max(result, sum);
            }
        }
        
        return result;
    }
}
