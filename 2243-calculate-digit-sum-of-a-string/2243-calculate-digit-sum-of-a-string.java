class Solution {
    private static int SUM(String s){
        int add = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            add+=(int)(ch-'0');
        }
        return add;
    }
    public String digitSum(String s, int k) {
        int n = s.length();
        while(s.length()>k){
            StringBuilder temp = new StringBuilder("");
            for(int i=0;i<s.length();i+=k){
                String str="";
                if((s.length()-i)>=k){
                    str = s.substring(i,i+k);
                }else{
                    str = s.substring(i);
                }
                temp.append(SUM(str)+"");
            }
            s=temp.toString();
        }
        return s;
    }
}