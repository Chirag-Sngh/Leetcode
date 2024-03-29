class Solution {
    public boolean isHappy(int n) {
        List<Integer> numbers=new ArrayList<Integer>();
        while(n!=1){
            int temp=n;
            n=0;
            while(temp>0){
                n=n+(int)Math.pow((temp%10),2);
                temp=temp/10;
            }
            if(numbers.contains(n)){
                return false;
            }
            else{
                numbers.add(n);
            }
        }
        return true;
        
    }
    
}