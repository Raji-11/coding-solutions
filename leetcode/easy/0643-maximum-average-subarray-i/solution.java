class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        double avg=0;
        double maxavg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            
        }
        avg=(double)sum/k;
        maxavg=avg;
        int l=0,r=k-1;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            avg=(double)sum/k;
            maxavg=Math.max(maxavg,avg);
        }
        
        return maxavg;
        
    }
}