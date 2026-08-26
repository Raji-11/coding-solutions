class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        boolean p[]=new boolean[n+1];
        
        for(int i=2;i<=n;i++){
            p[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j=j+i){
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(p[i]==true){
                al.add(i);
            }
        }
        return al;
    }
}