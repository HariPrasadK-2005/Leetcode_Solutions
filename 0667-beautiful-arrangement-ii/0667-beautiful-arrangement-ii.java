class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int left = 1;
        int right = k+1;
        int ind = 0;
        while(left <= right){
                arr[ind++] = left++;
                if(left <= right){
                arr[ind++] = right--;
            }
        }
        for(int i=k+2; i<=n; i++){
            arr[ind++] = i;
        }
        return arr;
    }
}