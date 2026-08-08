class Solution {
    public boolean isHappy(int num) {
        int n = num;
        while(n != 1 && n != 4){
            int temp = n;
            int ans = 0;
            while(temp != 0){
                int mod = temp % 10;
                ans = ans + mod * mod;
                temp = temp / 10;
            }
            n = ans;
        }
        if(n == 1) return true;
        return false;
    }
}