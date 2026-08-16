class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(map.getOrDefault(nums2[i],0)>0){
                list.add(nums2[i]);
                map.put(nums2[i], map.getOrDefault(nums2[i],0)-1);
            }
        }
        int[] arr = new int[list.size()];
        int ind = 0;
        for(int num:list){
            arr[ind++] = num;
        }
        return arr;
    }
}