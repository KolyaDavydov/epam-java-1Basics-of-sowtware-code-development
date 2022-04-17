package ru.davydov.basic.linear;

import java.math.BigDecimal;
import java.math.RoundingMode;

//4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

	public static void main(String[] args) {
		double r = 123.456;
		
		int first = (int) r;          //  целая часть от числа
		double last = r - first;      // дробная часть числа
		
		double result = (last * 1000.000) + ((double) first / 1000.000);
		
		BigDecimal bd = new BigDecimal(Double.toString(result));
	    bd = bd.setScale(3, RoundingMode.HALF_UP);       // отрезает все лишние цифры через три значения после запятой
	    
	    result = bd.doubleValue();
	    
		System.out.println(result);
		
	}

}
