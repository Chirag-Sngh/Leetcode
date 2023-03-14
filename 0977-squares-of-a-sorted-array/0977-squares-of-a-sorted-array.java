class Solution {
    public int[] sortedSquares(int[] nums) {
    int size=nums.length;
    int output[]=new int[size];
       int curr=size-1;
    int p1=0;
    int p2=nums.length-1;
    while(p1<=p2){
    int left=nums[p1]*nums[p1];
    int right=nums[p2]*nums[p2];
      if(left>right){
          output[curr]=left;
          curr--;
          p1++;
      }
        else{
            output[curr]=right;
            curr--;
            p2--;
        }
    }
        return output;
    }
}