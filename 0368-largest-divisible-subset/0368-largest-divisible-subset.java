class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
      
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            dp[i][1]=i;
            dp[i][0]=1;
        }

        
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]!=0)
                    continue;
                if(dp[j][0]+1>dp[i][0])
                    dp[i]=new int[]{dp[j][0]+1,j};
            }
            if(ans[0]<dp[i][0]){
                ans=new int[]{dp[i][0],i};
            }
        }
        List<Integer>list=new ArrayList<>();
        int index=ans[1];
        while(index!=dp[index][1]){
            list.add(nums[index]);
            index=dp[index][1];
        }
        list.add(nums[index]);
        Collections.reverse(list);
        return list;
    }
}
