package ru.davydov.basic.branch;

// 2.Найти max{min(a, b), min(c, d)}.

public class Task2 {
	public static void main(String[] args) {
		int a = 34, b = 67;
		int c = 78, d = -198;
		
		System.out.println("Максимальное число из минимальных: " + Math.max(Math.min(a, b), Math.min(c, d)));
	}
}
