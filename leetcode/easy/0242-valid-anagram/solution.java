class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<slen;i++){
            char ch1=s.charAt(i);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
        }
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<tlen;i++){
            char ch2=t.charAt(i);
            hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
        }
        return hm1.equals(hm2);
        
    }
}