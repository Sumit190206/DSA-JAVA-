class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right= num;
        while(left<=right){
            int mid = left + (right-left)/2;
            long sq= (long) mid*mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        // if(num ==1){
        //     return true;
        // }

        // double n = 1;
        // double odd = 3;
        // while(n<num){
        //     n +=odd;
        //     odd +=2;
        // }
        // if(n==num){
        //     return true;
        // }
        return false;
    }
}