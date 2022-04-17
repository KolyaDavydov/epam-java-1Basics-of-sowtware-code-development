package ru.davydov.basic.cycle;

/*
5.  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид: An = 1/2pow(n) + 1/3pow(n)
*/

public class Task5 {

	public static void main(String[] args) {
		double sum = 0;
		
		double e = 0.01;
		
		int i = 1;
		while(true) {
			double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			sum = sum + a;
			i++;
			if(a < e) break;
		}
		
		System.out.println(sum);
	}

}
