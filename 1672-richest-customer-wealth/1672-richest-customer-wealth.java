class Solution {
    public int maximumWealth(int[][] accounts) {
        int max;
        int [] wealth=new int[accounts.length];
        for (int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
             wealth[i]+=accounts[i][j];
            }
        }
        Arrays.sort(wealth);
        return wealth[wealth.length-1];
        
    }
}