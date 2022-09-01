package ru.davydov.basic.cycle;

/*
	8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Task8 {

	public static void main(String[] args) {
		int firstNum = 7890123;
		int secondNum = 1473690;
		
		printSameDigit(firstNum, secondNum);

	}
	
	// печать одинаковых цифр двух переданных чисел	
	private static void printSameDigit(int firstNum, int secondNum) {
		int[] first = numToArrayOfDigit(firstNum);
		int[] second = numToArrayOfDigit(secondNum);
		
		System.out.print("Цифры входящие как в первое число так и во второе: ");
		
		for(int k = 0; k <= 9; k++) {
			for(int i = 0; i < first.length; i++) {
				for(int j = 0; j < second.length; j++) {
					if(k == first[i] && k == second[j]) {
						System.out.print(k + ", ");
					}
				}
			}
		}
	}
	
	// метод для перевода числа в массив цифр
		private static int[] numToArrayOfDigit(int num) {
			
			char[] charNumArray = Integer.toString(num).toCharArray();
			int[] digitArray = new int[charNumArray.length];
			for(int i = 0; i < charNumArray.length; i++) {
				digitArray[i] = Integer.parseInt(String.valueOf(charNumArray[i]));
			}
			return digitArray;
		}

}
