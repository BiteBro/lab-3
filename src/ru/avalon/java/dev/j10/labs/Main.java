package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
		System.out.println("Инициализация последовательностью фибоначи");
		FibonacciInitializer fibInit = new FibonacciInitializer();
		fibInit.initialize(array);
		arrayContent(array);
		System.out.println("Сумма элементов массива");
		System.out.println(arraySum(array));
		System.out.println("Инициализация массива рандомными значениями от -50 до 50");
		RandomInitializer randInit = new RandomInitializer();
		randInit.initialize(array);
		arrayContent(array);
		System.out.println("Сортировка пузырьком");
		BubbleSort bs = new BubbleSort();
		bs.sort(array);
		arrayContent(array);
		System.out.println("Инициализация массива рандомными значениями от -50 до 50");
		randInit.initialize(array);
		arrayContent(array);
		System.out.println("Сортировка выбором");
		SelectionSort selectSort = new SelectionSort();
		selectSort.sort(array);
		arrayContent(array);
		System.out.println("Инициализация массива рандомными значениями от -50 до 50");
		randInit.initialize(array);
		arrayContent(array);
		System.out.println("Сортировка Шелла");
		ShellSort shSort = new ShellSort();
		shSort.sort(array);
		arrayContent(array);
		/*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
    // выводит содержание массива
    public static void arrayContent(int[] array){
		for (int i: array) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	// сумма значений элементов массива
    public static int arraySum(int[] array){
    	int sum = 0;
		for (int i: array) {
			sum += i;
		}
		return sum;

	}
}
