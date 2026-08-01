class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l1= new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    String s ="";
                    s=s+i+':';
                    if(j<10){
                        s+=0;
                    }
                    s=s+j;
                    //System.out.println(s);
                    l1.add(s);
                    
                }
            }
        }
        return l1;
    }
}