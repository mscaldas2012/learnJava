package edu.msc.math;

/**
 * Created by mcq1 on 3/28/2016.
 */
public class FibonacciTest {

    @org.junit.Test
    public void testFibonacci() throws Exception {
        for (int i = 0; i < 10; i++)
        System.out.println("Fibo("+i+"): " + Fibonacci.fibonacci(i));
    }
}