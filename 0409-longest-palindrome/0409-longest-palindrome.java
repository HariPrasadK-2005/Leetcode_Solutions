class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        boolean one = false;
        int ans = 0;

        for(char c : map.keySet()){
            int num = map.get(c);
            if(num % 2 == 0){
                ans += num;
            }
            else{
                ans += num -1;
                one = true;
            } 
        }
        if(one) ans++;
        return ans;

    }
}