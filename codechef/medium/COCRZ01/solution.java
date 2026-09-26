class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        intervalList.sort((a,b)->Integer.compare(a[1],b[1]));
        int count=0;
        int prevEnd=Integer.MIN_VALUE;
        for(int[] interval:intervalList){
            int start=interval[0];
            int end=interval[1];
             if(start>=prevEnd){
                 count++;
                 prevEnd=end;
             }
        }
        return intervalList.size()-count;
        
    }
}