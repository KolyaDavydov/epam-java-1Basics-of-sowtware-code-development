package ru.davydov.basic.branch;

/*
	4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
	Определить, пройдет ли кирпич через отверстие.
*/

public class Task4 {
	public static void main (String[] args) {
		// размеры отверстия
		int a = 66;
        int b = 119;
			
        // размеры кирпича;
		int x = 120;
        int y = 65;
        int z = 250;
	        
        if (((a >= x) && (b >= y))
                || ((a >= y) && (b >= x))
                || ((a >= x) && (b >= z))
                || ((a >= z) && (b >= x))
                || ((a >= y) && (b >= z))
                || ((a >= z) && (b >= y))) {
            System.out.println("Кирпич проходит");
        }
        else {
            System.out.println("Кирпич не проходит, даже на полшишки");
        }
    }
	
}

