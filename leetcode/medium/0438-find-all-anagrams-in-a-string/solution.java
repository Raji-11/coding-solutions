class Solution{
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> res=new ArrayList<>();
        if(p.length()>s.length()) return res;
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int l=0,count=p.length();
        for(int r=0;r<s.length();r++){
            if(freq[s.charAt(r)-'a']>0){
                count--;
            }
            freq[s.charAt(r)-'a']--;
            if(r-l+1>p.length()){
                if(freq[s.charAt(l)-'a']>=0)count++;
                freq[s.charAt(l)-'a']++;
                l++;
            }
            if(r-l+1==p.length()&&count==0)res.add(l);
        }
        return res;
    }
}
