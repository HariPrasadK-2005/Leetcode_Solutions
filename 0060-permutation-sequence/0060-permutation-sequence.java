class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<= n; i++){
            list.add(i);
        }
        int size = list.size();
        int factorial = factorial(n-1);
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++){
            int index = (k - 1) / factorial;
            ans.append(list.get(index));
            list.remove(index);
            k = (k - 1) % factorial + 1;
            if(list.size() > 0){
                factorial /= list.size();
            }
        }
        return ans.toString();
    }
    public int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}