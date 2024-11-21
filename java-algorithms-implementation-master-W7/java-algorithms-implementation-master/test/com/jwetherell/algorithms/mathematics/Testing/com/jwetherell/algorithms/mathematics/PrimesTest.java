package com.jwetherell.algorithms.mathematics;

import junit.framework.TestCase;

import java.util.Map;

import static com.jwetherell.algorithms.mathematics.Primes.*;

public class PrimesTest extends TestCase {

    public void testGetPrimeFactorization() throws Exception{
        Map<Long, Long> map = getPrimeFactorization(30L);

        assertTrue(map.containsKey(2L));
        assertTrue(map.containsKey(3L));
        assertTrue(map.containsKey(5L));

        // Check that the counts (values) for each prime factor are correct
        assertEquals(Long.valueOf(1), map.get(2L));
        assertEquals(Long.valueOf(1), map.get(3L));
        assertEquals(Long.valueOf(1), map.get(5L));

        System.out.println(map); // This showed that there is a 4 elements where the 4=0, we don't want that
        // Check that no unexpected factors are in the map
        assertEquals(3, map.size()); // Only 3 prime factors: 2, 3, 5 // We find that this fails
        // I'm unsure exactly of how to fix this issue as I've never worked with maps before.
        // I can define the issue that is that it appears that even if the map contains 0 elements of that number
        // it will define that value in the map. A way to fix this would be to at the end, re loop the map and remove all the keys with 0 value
    }


    public void testIsPrime() {
        // upon reading the code before unit testing, it is noted that it considers 1 a prime number which is not by definition
        // also it doesn't handle negatives


        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertFalse(isPrime(1));
        assertFalse(isPrime(0));
        assertFalse(isPrime(-5));

        assertFalse(isPrime(4));
        assertFalse(isPrime(100));
        assertFalse(isPrime(100000));

        assertTrue(isPrime(5));
        assertTrue(isPrime(7));
        assertTrue(isPrime(11));
        assertTrue(isPrime(13));

        assertTrue(isPrime(7919));   // Large prime
        assertTrue(isPrime(104729));

    }

    public void testSieveOfEratosthenes() {
        assertFalse(sieveOfEratosthenes(1));  // 1 is not prime
        assertTrue(sieveOfEratosthenes(2));   // 2 is prime
        assertTrue(sieveOfEratosthenes(3));   // 3 is prime
        assertFalse(sieveOfEratosthenes(4));

        assertTrue(sieveOfEratosthenes(5));   // 5 is prime
        assertFalse(sieveOfEratosthenes(6));  // 6 is not prime
        assertTrue(sieveOfEratosthenes(7));

        assertTrue(sieveOfEratosthenes(97));    // 97 is prime
        assertFalse(sieveOfEratosthenes(100));  // 100 is not prime
        assertTrue(sieveOfEratosthenes(101));   // 101 is prime
        assertFalse(sieveOfEratosthenes(102));

    }

    public void testMillerRabinTest() {

        assertFalse(millerRabinTest(0));  // 0 is not prime
        assertFalse(millerRabinTest(1));  // 1 is not prime
        assertTrue(millerRabinTest(2));   // 2 is prime
        assertTrue(millerRabinTest(3));   // 3 is prime
        assertFalse(millerRabinTest(4));  // 4 is not prime

        assertTrue(millerRabinTest(5));   // 5 is prime
        assertTrue(millerRabinTest(7));   // 7 is prime
        assertTrue(millerRabinTest(11));  // 11 is prime
        assertTrue(millerRabinTest(13));  // 13 is prime
        assertTrue(millerRabinTest(97));  // 97 is prime

        assertFalse(millerRabinTest(6));  // 6 is not prime
        assertFalse(millerRabinTest(9));  // 9 is not prime
        assertFalse(millerRabinTest(15)); // 15 is not prime
        assertFalse(millerRabinTest(100)); // 100 is not prime
    }
}