class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        String num = "123456789";
        List<Integer> ls = new ArrayList<>();

        for(int i=2;i<=9;i++){
            for(int j=0;j<=num.length()-i;j++){
                int x = Integer.parseInt(num.substring(j,j+i));
                if(x<=high && x>=low){
                    ls.add(x);
                }
            }
        }
        return ls;
        
    }
}