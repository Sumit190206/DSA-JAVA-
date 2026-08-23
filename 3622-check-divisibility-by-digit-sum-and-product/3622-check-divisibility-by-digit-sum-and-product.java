class Solution {
    public boolean checkDivisibility(int n) {
        int product  = 1;
        int m =n;
        int sum = 0;
    // number divided into small part;
        while(m!=0){
            int rem = m%10;
            sum += rem;
            product *=rem;
            m= m/10;
        }
        int result = sum + product;
        if(n % result == 0){
            return true;
        }
        return false;
    }
}