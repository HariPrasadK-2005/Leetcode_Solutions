class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int length = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right)) > 2){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            length = right - left + 1;
            max = (max < length)? length : max;
        }
        return max;
    }
}