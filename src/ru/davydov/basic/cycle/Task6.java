package ru.davydov.basic.cycle;

/*
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * */

public class Task6 {

	public static void main(String[] args) {
		String symbol = "Выводим соответствии между символами";
        for (int i = 0; i < symbol.length(); i++) {
                System.out.println(symbol.charAt(i) + " -> " + symbol.codePointAt(i));
        }
	}

}
