class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int ind = 0;
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] < arr[i-1]){
                ind = i-1;
                break;
            }
        }
        int max = 0;
        int index = 0;
        for(int i=ind; i<arr.length; i++){
            if(arr[i] < arr[ind] && arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        int temp = arr[ind];
        arr[ind] = arr[index];
        arr[index] = temp;
        return arr;
    }
}