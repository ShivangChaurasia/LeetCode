class Solution {
    // static{
    //     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
    //             fw.write("0");
    //         } catch (Exception e) {
    //         }
    //     }));

    // }
    public int minOperations(String s) {
        int Zchanges=0;
        int Ochanges=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!='0'){
                    Zchanges++;
                }
            }else{
                if(s.charAt(i)!='1'){
                    Zchanges++;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!='1'){
                    Ochanges++;
                }
            }else{
                if(s.charAt(i)!='0'){
                    Ochanges++;
                }
            }
        }

        return Math.min(Zchanges,Ochanges);
        
    }
}