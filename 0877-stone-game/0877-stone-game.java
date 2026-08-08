class Solution {
    public boolean stoneGame(int[] piles) {
        int alice = 0;
        int bob = 0;
        for(int i=0; i<piles.length; i++){
            if(i % 2 == 0) alice += piles[i];
            if(i % 2 != 0) bob += piles[i];
        }
        if(alice > bob ) return true;
        else{
            alice = 0;
            bob = 0;
        }
        for(int i=piles.length-1; i>=0; i--){
            if(i % 2 != 0) alice += piles[i];
            if(i % 2 == 0) bob += piles[i];
        }
        if(alice > bob ) return true;
        return false;
    }
}