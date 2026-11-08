class Solution {
    public int[] shuffle(int[] nums, int n) {
    int [] nums1=new int [n];
    int [] nums2=new int [n]; 
    int idx=0;
    for(int i=0;i<n;i++){
        nums1[i]=nums[i];
    } 
    for(int i=n;i<nums.length;i++){
        nums2[idx]=nums[i];
        idx++;
    } 
    int [] mix=new int [nums.length] ;
    int j=0, k=0;
    for(int i=0;i<nums.length;i++){
        if(i%2==0){
            mix[i]=nums1[j];
            j++;
        }
        else{
            mix[i]=nums2[k];
            k++;
        }
        
    } 
    return mix;
    }
}