class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
            pq.offer(entry);
        }
        int index=0;
        int ans[]=new int[k];
        while(k>0){
            ans[index++]=pq.poll().getKey();
            k--;
        }
        return ans;
    }
}