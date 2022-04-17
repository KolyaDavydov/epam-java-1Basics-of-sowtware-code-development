package ru.davydov.basic.cycle;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h


public class Task2 {

	public static void main(String[] args) {
		double a = -1;
		double b = 4;
		
		double h = 0.5;
		
		double x = a;

		while (x <= b) {
			double y = (x > 2 ? x : -x);
            System.out.println("y = " + y + "(x = " + x + ")");
            x = x + h;
        }

	}

}
