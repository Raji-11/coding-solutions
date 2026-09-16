class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
           
        }
        
        return new ArrayList<>(hs);
    }
}