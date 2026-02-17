class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ls = new ArrayList<>();
        if(turnedOn>8){
            return ls;
        }

        for(int i=0; i<12;i++){
            int bit = 0;
            String bin = Integer.toBinaryString(i);
            for(int j = 0;j<bin.length();j++){
                if(bin.charAt(j)=='1'){
                    bit++;
                }
            }
            if(bit<turnedOn){
                for(int k=1; k<60;k++){
                    int mbit = 0;
                    String mbin = Integer.toBinaryString(k);
                    for(int l = 0;l<mbin.length();l++){
                        if(mbin.charAt(l)=='1'){
                            mbit++;
                        }
                    }

                    if(mbit==(turnedOn-bit)){
                        if(k>9){
                            ls.add(""+i+":"+k);
                        }else{
                            ls.add(""+i+":0"+k);
                        }
                    }
            
                }

            }else if(bit==turnedOn){
                ls.add(""+i+":00");
            }
        }

        return ls;
    }
}