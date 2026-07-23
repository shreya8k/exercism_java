import java.math.BigInteger;

class Grains {
    BigInteger k = BigInteger.ONE;
    private int square;
    BigInteger grainsOnSquare(final int square) {
        
        if(square<=0 || square>64)throw new IllegalArgumentException("square must be between 1 and 64");
       BigInteger b = BigInteger.valueOf(2).pow(square-1);

        return b;
    }

    BigInteger grainsOnBoard() {
         return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);

    }
}