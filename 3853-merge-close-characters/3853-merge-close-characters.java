class Solution {
    public String mergeCharacters(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        while(true){
            int left = -1;
            int right = -1;
            outer: 
            for(int i=0;i<sb.length();i++){
                for(int j= i+1;j<sb.length();j++){

                    if(sb.charAt(i)==sb.charAt(j) && j-i<=k){
                        left = i;
                        right = j;
                        break outer;
                    }
                }
                }

            if(left==-1) break;

            sb.deleteCharAt(right);
        }
        return sb.toString();
    }
}