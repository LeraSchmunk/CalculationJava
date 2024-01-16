package com.example.firstjavaproject;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String calc() {
        Scanner sc = new Scanner(System.in); //Создаем новый объект класса Scanner, параметром передаем System.in - стандартный поток входных данных
        System.out.println("Input:");
        String string = sc.nextLine(); //Создаем новый объект класса string и ссылаем в него то, что записано с клавиатуры (строка)
        String[] arr = string.split(" ");
//        System.out.println(Arrays.toString(arr));
        int res = 0;

        if (arr.length > 3) {
            System.out.println("Output:");
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else if (arr.length <= 2) {
            System.out.println("Output:");
            throw new RuntimeException("строка не является математической операцией");
        }

    try{
        int num1=Integer.parseInt(arr[0]); //Преобразовываем данные из массива в целое число по их индексу
        int num2=Integer.parseInt(arr[2]);

        switch (arr[1]){
            case "+":
                res = num1 + num2;
//                System.out.println("Output:" + res);
                break;
            case "-":
                res = num1 - num2;
//                System.out.println("Output:" + res);
                break;
            case "/":
                res = num1 / num2;
//                System.out.println("Output:" + res);
                break;
            case "*":
                res = num1 * num2;
//                System.out.println("Output:" + res);
                break;
            default: System.out.println("Output:");
                throw new RuntimeException("неверный оператор, используйте только +, -, /, * " +
                        "Ваш знак - " + arr[1]);
            }
        }catch (NumberFormatException e) {
            System.out.println("Output:");
            throw new RuntimeException("Используйте только целые числа");

        }

        String result = Integer.toString(res);

        System.out.println("Output:");
        System.out.println(result);

        return result;

    }

    public static void main(String[] args) {
        calc();

    }
}