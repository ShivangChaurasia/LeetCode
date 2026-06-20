class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] s1 = s.toCharArray();
            char[] s2 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            return Arrays.equals(s1,s2);
        }return false;
    }
}




// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         int[] arr = new int[26];

//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-'a']++;
//             arr[t.charAt(i)-'a']--;
//         }


//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }