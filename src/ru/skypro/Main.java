package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 6
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        System.out.println(result);
        int newResult=Math.abs(result);
        System.out.println(newResult);

    }
}
