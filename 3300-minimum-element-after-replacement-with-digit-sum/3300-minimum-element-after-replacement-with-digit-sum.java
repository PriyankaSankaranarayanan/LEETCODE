class Solution {
    public int minElement(int[] nums) {
     int min;
     int[] rep=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        int digit=0;
        while(nums[i]>0){
        digit=digit+nums[i]%10;
        nums[i]=nums[i]/10;
        }
        rep[i]=digit;
     }
     min=rep[0];
     for(int i=0;i<rep.length;i++){
        if(min>rep[i]){
            min=rep[i];
        }
     }
     return min;  
    }
}