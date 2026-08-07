class Solution {
    public int addDigits(int n) {
        while(n > 9){
            int answer = 0;
            while(n!=0)
            {
                int temp = n% 10;
                answer = answer + temp;
                n = n / 10;
            }
            n = answer;
        }
        return n;
    }
}