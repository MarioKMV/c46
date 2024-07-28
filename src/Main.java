import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Введите выражение (например 2+3) используйте целые числа от 1 до 10 без пробелов, поддерживаются операции (+,-,*,/): ");
            String expression = input.nextLine();

            String[] tokens = expression.split("");

            if (tokens.length != 3) {
                System.out.println("Некорректный формат выражения");
                return;
            }
            int num1 = Integer.parseInt(tokens[0]);
            String operator = tokens[1];
            int num2 = Integer.parseInt(tokens[2]);
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Числа должны быть от 1 до 10");
                return;
            }
            int result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Неподдерживаемая операция");
                    return;
            }

            System.out.println("Результат: " + result);
        } while (true);
    }
}