package ru.davydov.basic.cycle;

// 3. Найти сумму квадратов первых ста чисел. 


public class Task3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		
		System.out.println("Сумма квадратов первых ста целых чисел = " + sum);
	}

}
