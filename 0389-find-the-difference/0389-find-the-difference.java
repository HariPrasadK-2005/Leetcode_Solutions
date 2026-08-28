class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        char x = 'a';
        for(char c : map.keySet()){
            if(map.get(c) >0){
                x = c;
            }
        }
        return x;
    }
}