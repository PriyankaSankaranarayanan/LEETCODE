class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    int [] forder=new int[friends.length] ;
    int idx=0;
    for (int i=0;i<order.length;i++){
        for (int j=0;j<friends.length;j++){
            if (order[i]==friends[j]){
               forder[idx]=order[i];
               idx++;
            }
        }
    } 
    return forder;  
    }
}