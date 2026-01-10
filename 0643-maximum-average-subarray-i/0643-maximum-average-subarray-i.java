class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i-k]+ nums[i];
            max = Math.max(max, sum);
        }
        return (double)max/k;
    }
}
/**
cộng tổng k phần tử đầu
mỗi vòng lặp thì loại bỏ phần tử đầu thêm 1 phần tử cuối
mỗi lần update max

 */
