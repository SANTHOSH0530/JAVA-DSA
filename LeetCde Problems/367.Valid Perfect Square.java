class Solution {
    public boolean isPerfectSquare(int num) {
       if(num==1){
        return true;
       }
       int lb=1;
       int ub=num/2;
       while(lb<=ub){
        int mid=(lb+ub)/2;
        long sq=(long)mid*mid;
        if(sq==num){
            return true;
        }
        else if(sq<num){
            lb=mid+1;
        }
        else if(sq>num){
            ub=mid-1;
            }
       }
       return false;
    }
}
