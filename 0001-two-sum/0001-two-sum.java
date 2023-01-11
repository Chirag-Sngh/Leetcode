class Solution {
    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
//         for(int i=0;i<nums.length;i++){
//             int complement=target-nums[i];
//             if(map.containsKey(complement)){
//                 return new int[]{map.get(complement),i};
//             }
//             else{
//                 map.put(nums[i],i);
//             }
//         }
//         throw new IllegalArgumentException("No two sum solution");
            
//     }
// }

// int[] ans=new int[2];
// for(int i=0;i<nums.length-1;++i){
//     for(int j=i+1;j<nums.length;++j){
//         if(nums[i]+nums[j]==target){
//             ans[0]=i;
//             ans[1]=j;
//             break;
//         }
//     }
// }
// return ans;
// }
// }
        
    Map<Integer, Integer> indexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer requiredNum=target-nums[i];
            if(indexMap.containsKey(requiredNum)){
                return new int[]{indexMap.get(requiredNum),i};
            }
            indexMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}    
