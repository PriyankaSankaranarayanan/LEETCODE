class Solution {
    public int minOperations(int[] nums, int k) {
      int sum=0;
      for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
      }  
      int target=0;
      for(int j=sum;j>=0;j--){
        if(j%k==0){
            target+=j;
            break;
        }
        else{
            continue;
        }
      }
      int diff=sum-target;
      return diff;
    }
}