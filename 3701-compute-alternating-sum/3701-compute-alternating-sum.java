class Solution {
    public int alternatingSum(int[] nums) {
     int answer=0;
     for(int i=0;i<nums.length;i++){
        if(i%2==0){
            answer=answer+nums[i];
        }
        else{
            answer=answer-nums[i];
        }
     } 
     return answer;  
    }
}