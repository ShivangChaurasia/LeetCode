class Solution {
    public int maxArea(int[] h) {
        int s=0,e=h.length-1;
        int area=-1;
        if(h.length==1){
            return 0;
        }
        if(h.length==2){
            return 1*Math.min(h[0],h[1]);
        }
        while(s<e){
            int diff=e-s;
            if(h[s]<=h[e]){
                if(area<h[s]*diff){
                    area=h[s]*diff;
                }
                s++;
            }else{
                if(area<h[e]*diff){
                    area=h[e]*diff;
                }
                e--;
            }
        }
        return area;
    }
}



