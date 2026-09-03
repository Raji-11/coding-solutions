class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(hs.containsKey(complement)){
                return new int[] {hs.get(complement),i};
            }
            hs.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}