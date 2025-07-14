class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=0;
        double winsum=0;
        for(int i=0;i<k;i++){
            winsum +=nums[i];
        }
        maxavg=winsum/k;
        for(int i=k;i<nums.length;i++){
            winsum=winsum - nums[i-k]+nums[i];
            double currentavg=winsum/k;
            if(currentavg>maxavg){
                maxavg=currentavg;
            }
        }
        return maxavg;
    }
}
