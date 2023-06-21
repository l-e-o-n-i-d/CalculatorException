package home_work_8.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean isActive = true;
        System.out.println("Програма калькулятор. Доступні операції для виконная обчислень: додавання(+), віднімання(-)," +
                " множення(*), ділення(/).");
        while (isActive) {
            System.out.println("Введіть знак арефметичної операції ( +, -, *, / ):");
            String sign = sc.next();
            try {
            System.out.println("Введіть перше число:");
            double firstUserNumber = sc.nextDouble();
            System.out.println("Введіть наступне число:");
            double secondUserNumber = sc.nextDouble();
//            try {
                double result;
                switch (sign){
                    case "+":
                        result = calculator.add(firstUserNumber, secondUserNumber);
                        System.out.println(result);
                        break;
                    case "-":
                        result = calculator.sub(firstUserNumber, secondUserNumber);
                        System.out.println(result);
                        break;
                    case "*":
                        result = calculator.mul(firstUserNumber, secondUserNumber);
                        System.out.println(result);
                        break;
                    case "/":
                        result = calculator.div(firstUserNumber, secondUserNumber);
                        System.out.println(result);
                        break;
                }
            }catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
            }
            catch (InputMismatchException ex){
                System.err.println("Помилка вводу. Допустимі лише цифри! ");
                sc.nextLine();
            }
            System.out.println("Повторити обчислення ? (Y-так/N-ні)");
            String isContinue = sc.next();
            if (isContinue.toUpperCase().equals("N") || isContinue.toUpperCase().equals("НІ")){
                isActive = false;
                System.out.println("Заходьте ще)");
            }
        }
    }
}
