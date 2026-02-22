class Solution {
    public String maximumXor(String s, String t) {

        int oneCount = 0;
        for (char c : t.toCharArray()) {
            if (c == '1') oneCount++;
        }
        int zeroCount = t.length() - oneCount;

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '0') {

                if (oneCount > 0) {
                    ans.append('1');
                    oneCount--;
                } else {
                    ans.append('0');
                    zeroCount--;
                }
            } else { 

                if (zeroCount > 0) {
                    ans.append('1');
                    zeroCount--;
                } else {
                    ans.append('0');
                    oneCount--;
                }
            }
        }

        return ans.toString();
    }
}