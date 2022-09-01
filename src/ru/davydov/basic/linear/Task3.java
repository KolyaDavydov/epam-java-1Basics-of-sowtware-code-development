package ru.davydov.basic.linear;

/*
 	3.Вычислить значение выражения по формуле
	(все переменные принимают действительные значения)
*/

public class Task3 {

	public static void main(String[] args) {
		double x = 4.0;
		double y = 2.0;
		
		double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println("Value of expression = " + result);
	}

}
