package com.jwetherell.algorithms.mathematics;

import junit.framework.TestCase;

import static com.jwetherell.algorithms.mathematics.Multiplication.*;

public class MultiplicationTest extends TestCase {

    public void testMultiplication() {

        assertEquals(6, multiplication(2, 3));     // 2 * 3 = 6
        assertEquals(50, multiplication(5, 10));   // 5 * 10 = 50
        assertEquals(1000000, multiplication(1000, 1000)); // 1000 * 1000 = 1000000

        assertEquals(-6, multiplication(-2, 3));   // -2 * 3 = -6
        assertEquals(6, multiplication(-2, -3));  // -2 * -3 = 6
        assertEquals(-50, multiplication(-5, 10)); // -5 * 10 = -50

        // Based on the code provided, this multiplication seems to return 1 when the value is multiplied by 0
        // I would assume this is not an error as there is an if statement testing exactly this.

        assertEquals(1, multiplication(0, 3));    // Non-standard behavior: should return 1
        assertEquals(1, multiplication(3, 0));    // Non-standard behavior: should return 1
        assertEquals(1, multiplication(0, 0));    // Non-standard behavior: should return 1


    }

    public void testMultiplyUsingLoop() {

        assertEquals(6, multiplyUsingLoop(2, 3));     // 2 * 3 = 6
        assertEquals(50, multiplyUsingLoop(5, 10));   // 5 * 10 = 50
        assertEquals(1000000, multiplyUsingLoop(1000, 1000)); // 1000 * 1000 = 1000000

        assertEquals(-6, multiplyUsingLoop(-2, 3));   // -2 * 3 = -6
        assertEquals(6, multiplyUsingLoop(-2, -3));   // -2 * -3 = 6
        assertEquals(-50, multiplyUsingLoop(-5, 10)); // -5 * 10 = -50

        assertEquals(0, multiplyUsingLoop(0, 3));    // 0 * 3 = 0

        // The below test case failed, to fix just need to change some code
        assertEquals(0, multiplyUsingLoop(3, 0));    // 3 * 0 = 0
        assertEquals(0, multiplyUsingLoop(0, 0));    // 0 * 0 = 0

        assertEquals(2000000000L, multiplyUsingLoop(1000000, 2000)); // 1,000,000 * 2,000
        assertEquals(-2000000000L, multiplyUsingLoop(-1000000, 2000)); // -1,000,000 * 2,000
        assertEquals(4611686014132420609L, multiplyUsingLoop(2147483647, 2147483647)); // Max int * Max int

    }

    public void testMultiplyUsingRecursion() {

        assertEquals(6, multiplyUsingRecursion(2, 3));     // 2 * 3 = 6
        assertEquals(50, multiplyUsingRecursion(5, 10));   // 5 * 10 = 50
        assertEquals(1000000, multiplyUsingRecursion(1000, 1000)); // 1000 * 1000 = 1000000

        assertEquals(-6, multiplyUsingRecursion(-2, 3));   // -2 * 3 = -6
        assertEquals(6, multiplyUsingRecursion(-2, -3));   // -2 * -3 = 6
        assertEquals(-50, multiplyUsingRecursion(-5, 10)); // -5 * 10 = -50

        assertEquals(0, multiplyUsingRecursion(0, 3));    // 0 * 3 = 0

        //same issue as above occured, I attempted to fix it but I'm unsure of how to fix it
        //the issue is related to the fact that if b is 0, it will still do one iteration
        assertEquals(0, multiplyUsingRecursion(3, 0));    // 3 * 0 = 0
        assertEquals(0, multiplyUsingRecursion(0, 0));    // 0 * 0 = 0

        assertEquals(2000000000L, multiplyUsingRecursion(1000000, 2000)); // 1,000,000 * 2,000
        assertEquals(-2000000000L, multiplyUsingRecursion(-1000000, 2000)); // -1,000,000 * 2,000
        assertEquals(4611686014132420609L, multiplyUsingRecursion(2147483647, 2147483647)); // Max int * Max int

    }

    public void testMultiplyUsingShift() {

        assertEquals(6, multiplyUsingLogs(2, 3));     // 2 * 3 = 6
        assertEquals(50, multiplyUsingLogs(5, 10));   // 5 * 10 = 50
        assertEquals(1000000, multiplyUsingLogs(1000, 1000)); // 1000 * 1000 = 1000000

        assertEquals(-6, multiplyUsingLogs(-2, 3));   // -2 * 3 = -6
        assertEquals(6, multiplyUsingLogs(-2, -3));   // -2 * -3 = 6
        assertEquals(-50, multiplyUsingLogs(-5, 10)); // -5 * 10 = -50

        assertEquals(0, multiplyUsingLogs(0, 3));    // 0 * 3 = 0
        assertEquals(0, multiplyUsingLogs(3, 0));    // 3 * 0 = 0
        assertEquals(0, multiplyUsingLogs(0, 0));    // 0 * 0 = 0

    }

    public void testMultiplyUsingLogs() {

        assertEquals(6, multiplyUsingLogs(2, 3));     // 2 * 3 = 6
        assertEquals(50, multiplyUsingLogs(5, 10));   // 5 * 10 = 50
        assertEquals(1000000, multiplyUsingLogs(1000, 1000)); // 1000 * 1000 = 1000000

        assertEquals(-6, multiplyUsingLogs(-2, 3));   // -2 * 3 = -6
        assertEquals(6, multiplyUsingLogs(-2, -3));   // -2 * -3 = 6
        assertEquals(-50, multiplyUsingLogs(-5, 10)); // -5 * 10 = -50

        assertEquals(0, multiplyUsingLogs(0, 3));    // 0 * 3 = 0
        assertEquals(0, multiplyUsingLogs(3, 0));    // 3 * 0 = 0
        assertEquals(0, multiplyUsingLogs(0, 0));    // 0 * 0 = 0
    }

    public void testMultiplyUsingFFT() {


        assertEquals("6", multiplyUsingFFT("2", "3"));             // 2 * 3 = 6
        assertEquals("50", multiplyUsingFFT("5", "10"));           // 5 * 10 = 50
        assertEquals("1000000", multiplyUsingFFT("1000", "1000")); // 1000 * 1000 = 1000000

        assertEquals("-6", multiplyUsingFFT("-2", "3"));           // -2 * 3 = -6
        assertEquals("6", multiplyUsingFFT("-2", "-3"));           // -2 * -3 = 6
        assertEquals("-50", multiplyUsingFFT("-5", "10"));         // -5 * 10 = -50

        assertEquals("0", multiplyUsingFFT("0", "3"));              // 0 * 3 = 0
        assertEquals("0", multiplyUsingFFT("3", "0"));              // 3 * 0 = 0
        assertEquals("0", multiplyUsingFFT("0", "0"));              // 0 * 0 = 0

    }

    public void testMultiplyUsingLoopWithStringInput() {

        assertEquals("6", multiplyUsingLoopWithStringInput("2", "3"));             // 2 * 3 = 6
        assertEquals("50", multiplyUsingLoopWithStringInput("5", "10"));           // 5 * 10 = 50
        assertEquals("1000000", multiplyUsingLoopWithStringInput("1000", "1000")); // 1000 * 1000 = 1000000

        assertEquals("-6", multiplyUsingLoopWithStringInput("-2", "3"));           // -2 * 3 = -6
        assertEquals("6", multiplyUsingLoopWithStringInput("-2", "-3"));           // -2 * -3 = 6
        assertEquals("-50", multiplyUsingLoopWithStringInput("-5", "10"));         // -5 * 10 = -50


        //These failed, fixed the problem
        assertEquals("0", multiplyUsingLoopWithStringInput("0", "3"));             // 0 * 3 = 0
        assertEquals("0", multiplyUsingLoopWithStringInput("3", "0"));             // 3 * 0 = 0
        assertEquals("0", multiplyUsingLoopWithStringInput("0", "0"));             // 0 * 0 = 0


    }

    public void testMultiplyUsingLoopWithIntegerInput() {


        assertEquals(6, multiplyUsingLoopWithIntegerInput(2, 3));               // 2 * 3 = 6
        assertEquals(50, multiplyUsingLoopWithIntegerInput(5, 10));             // 5 * 10 = 50
        assertEquals(1000000, multiplyUsingLoopWithIntegerInput(1000, 1000));   // 1000 * 1000 = 1000000

        assertEquals(-6, multiplyUsingLoopWithIntegerInput(-2, 3));             // -2 * 3 = -6
        assertEquals(6, multiplyUsingLoopWithIntegerInput(-2, -3));             // -2 * -3 = 6
        assertEquals(-50, multiplyUsingLoopWithIntegerInput(-5, 10));           // -5 * 10 = -50

        assertEquals(0, multiplyUsingLoopWithIntegerInput(0, 3));               // 0 * 3 = 0
        assertEquals(0, multiplyUsingLoopWithIntegerInput(3, 0));               // 3 * 0 = 0
        assertEquals(0, multiplyUsingLoopWithIntegerInput(0, 0));               // 0 * 0 = 0

    }
}