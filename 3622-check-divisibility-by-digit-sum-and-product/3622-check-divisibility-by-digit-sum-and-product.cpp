class Solution {
public:
    bool checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(n != 0){
            int temp = n % 10;
            sum = sum + temp;
            product = product * temp;
            n = n / 10;
        }
        sum = sum + product;
        if(num % sum == 0) return true;
        return false;
    }
};