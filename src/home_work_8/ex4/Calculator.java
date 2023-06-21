package home_work_8.ex4;

public class Calculator {
    public double add(double num1, double num2){
        return num1 + num2;
    }
    public double sub(double num1, double num2){
        return num1 - num2;
    }
    public double mul(double num1, double num2){
        return num1 * num2;
    }
    public double div(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }else {
                throw new ArithmeticException("Помилка! На нуль ділити не можна");
        }
    }
}
