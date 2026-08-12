class Solution {
    public double myPow(double x, int n) {

        long m = n;

        if (m < 0) {
            m = -m;
        }

        double ans = power(x, m);

        if (n < 0) {
            return 1 / ans;
        }

        return ans;
    }

    private double power(double x, long n) {

        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        double halfPower = half * half;

        if (n % 2 != 0) {
            halfPower *= x;
        }

        return halfPower;
    }
}