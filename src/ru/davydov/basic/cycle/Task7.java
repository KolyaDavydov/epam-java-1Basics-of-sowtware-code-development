package ru.davydov.basic.cycle;

import java.util.Scanner;

/*
	7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
	m и n вводятся с клавиатуры.
*/

public class Task7 {

	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите два натуральных числа в порядке возрастания:");
		System.out.print("m -> ");
		
		if(scanner.hasNextInt()) {
						
			m = scanner.nextInt();
			System.out.print("n -> ");
			
			n = scanner.nextInt();
			if(m < 1 || n < 1) {
				System.out.println("Вы ввели не натуральное число, перезапecтите программу и попробуйте снова.");
			}
			else if(m > n) {
				System.out.println("Перезапecтите программу и введите натуральные числа в поредке возрастания.");
			}
		}
		
		else {
			System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
		}
		scanner.close();
		
		if(m > 0 && n > m) {
			for(int i = m; i <= n; i++) {
				System.out.print("\nДелители числа " + i + ": ");
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						System.out.print(j + ", ");
					}
				}
			}
		}

	}

}
