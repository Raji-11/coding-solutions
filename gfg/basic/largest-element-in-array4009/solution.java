class Solution {
    public static int largest(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
