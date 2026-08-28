class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9\\s]", " ");
        String[] arr = paragraph.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr){
            boolean present = false;
            for(int i=0; i<banned.length; i++){
                if(s.equals(banned[i].toLowerCase())){
                    present = true;
                    break;
                }
            }
            if(present) continue;
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        String ans ="";
        int count = 0;
        for(String s : map.keySet()){
            if(map.get(s) > count){
                ans = "" + s;
                count = map.get(s);
            }
        }
        System.out.println(paragraph);
        return ans;
    }
}