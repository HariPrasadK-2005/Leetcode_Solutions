class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int number = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > max){
                max = map.get(num);
                number = num;
            }
        }
        return number;
    }
}