package ru.davydov.basic.cycle;

import java.util.Scanner;

/*1. Напишите  программу,  где  пользователь  вводит любое  целое  положительное  число.
 * А  программа  суммирует все числа от 1 до введенного пользователем числа.
*/

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Введите целое пoложительное число: ");
		
		int num = 1;
		int sum = 0;
		
		
		
		while(true) {
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			if(!scanner.hasNextInt()) {
				System.out.println("Введите целое пoложительное число: ");
				
			}
			else {
				num = scanner.nextInt();
				
				if(num < 1) {
					System.out.println("Введите целое пoложительное число: ");
				}
				else if(num > 1_000_364) {
					System.out.println("Вы ввели слишком большое число. Введите число меньше чем 1 000 365: ");
				}
				else {
					
					break;
				}
			}
			
		}
				
		for(int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("Сумма всех целых чисел от 1 до " + num + " равна = " + sum);
	}

}
