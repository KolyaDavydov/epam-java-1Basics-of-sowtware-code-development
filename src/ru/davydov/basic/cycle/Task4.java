package ru.davydov.basic.cycle;

import java.math.BigInteger;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {
		
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf((long) i * i));
        }
        
        System.out.println(result);
    }

}
