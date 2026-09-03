class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> hs=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    hs.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}