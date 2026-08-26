class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int a[]=new int[2];
        int e=0;
        int o=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
            e++;
            a[1]=e;
            
        }else{
            o++;
            a[0]=o;
          }
        }
        
        
        return a;
    }
}