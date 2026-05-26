class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper[ch - 'A'] = true;
            }else{
                lower[ch - 'a'] = true;
            }
        }

        for(int i=0;i<26;i++){
            if(lower[i] && upper[i]){
                 count++;
            }
        }

        return count;
    }
}