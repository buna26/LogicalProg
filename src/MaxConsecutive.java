public class MaxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count =0;
        int ans = 0;
        for (int i=0; i<n; i++)
        {
            if (nums[i] == 1){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count =0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
