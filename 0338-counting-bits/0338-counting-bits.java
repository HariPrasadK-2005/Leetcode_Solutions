class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            int count = 0;
            for(int j=0;j<=31;j++){
                int m = i & (1<<j);
                if(m != 0){
                    count++;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}