class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] rightfreq = new int [26];
        int[] leftfreq = new int[26];
        for(int i=0;i<n;i++){
            rightfreq[s.charAt(i)-'a']++;  //a=2,b=2,c=2
        }
        int answer =0;
        for(int i=0;i<n-1;i++){
            leftfreq[s.charAt(i)-'a']++;
            rightfreq[s.charAt(i)-'a']--;
            int common1 =0;
            int common2=0;
            for(int j=0;j<26;j++){
                if(leftfreq[j]>0 ){
                    common1++;
                }
                if(rightfreq[j]>0) common2++;
            }
            if(common1 == common2){
                answer++;
            }
        }
        return answer;
    }
}