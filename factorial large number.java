import java.math.BigInteger;

class Solution {

    public BigInteger factorial(int n) {

        BigInteger f = BigInteger.ONE;

        for(int i=1;i<=n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }
}