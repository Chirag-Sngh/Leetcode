class Solution {
    public int hIndex(int[] citations) {
        // int n=citations.length;
        // for(int i=0;i<n;i++){
        //     if(n-i<=citations[i]){
        //         return n-i;
        //     }
        // }
        // return 0;
        
        int ans=0;
        int n=citations.length;
        int start=0,end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(n-mid<=citations[mid]){
                ans=Math.max(n-mid,ans);
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
        
    }
}