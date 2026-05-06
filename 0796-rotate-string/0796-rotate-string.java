class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length());

        StringBuilder sb= new StringBuilder(s);
        sb.append(s);
        int n=s.length();
        for(int i=0;i<n;i++){ 
            if(sb.toString().substring(0+i,n+i).equals(goal)){
                return true;
            }
        }
        return false;
        
    }
}