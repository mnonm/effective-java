package stream;

import java.math.BigInteger;
import java.util.stream.Stream;


public class Mersenne {

    static BigInteger TWO = BigInteger.valueOf(2);

    public static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void printMersennePrimes() {
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(mp -> System.out.println(mp.bitLength() + ": " + mp));
    }
}
