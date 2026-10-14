class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));


        List<List<Integer>> ls = new ArrayList<>(); 
        int j=0;
        ls.add(new ArrayList<>(Arrays.asList(intervals[0][0], intervals[0][1])));

        for(int i=1;i<intervals.length;i++){
            if(ls.get(j).get(1)>=intervals[i][0]){
                int lsFront = ls.get(j).get(0);
                int lsBack = ls.get(j).get(1);
                int interFront = intervals[i][0];
                int interBack= intervals[i][1]; 
                ls.get(j).set(0,Math.min(lsFront,interFront));
                ls.get(j).set(1,Math.max(lsBack,interBack));

            }else{
                ls.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
                j++;
            }
        }

        int[][] arr = new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){
            arr[i][0]=ls.get(i).get(0);
            arr[i][1]=ls.get(i).get(1);
        }
        return arr;
    }
}
