class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> hs = new HashSet<>();
        int n = 1<<k;
        for(int j=0;j<=s.length()-k;j++){
            hs.add(s.substring(j,j+k));
        }
        if(hs.size()==n){
            return true;
        }
        
        return false;
    }
}