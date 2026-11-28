class Solution {
    public String winningPlayer(int x, int y) {
        int remove1 = 4;
        int xx = 1;
        int turn = 0;
        while(x>=1 && y>=4){
            x-=xx;
            y-=remove1;
           
            turn++;
        }
        if(turn%2==1){
            return "Alice";
        }else{
            return "Bob";
        }
    }
}