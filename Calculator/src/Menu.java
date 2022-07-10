import java.util.Scanner;

public class Menu {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рады приветствовать Вас в онлайн Калькуляторе!");
        while (true) {
            System.out.println("Сделайте свой выбор:");
            System.out.println("  1. Решение математической операции\n  2. Выход");//\n перенос строки
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите операцию +;  -; *; /");
                String c = scanner.nextLine();
                if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {

                    switch (c) {
                        case "-":
                            Minus minus = new Minus();
                            minus.action(a, b);
                            break;
                        case "+":
                            Sum sum = new Sum();
                            sum.action(a, b);
                            break;
                        case "/":
                            Div div = new Div();
                            div.action(a, b);
                            break;
                        case "*":
                            Multiplication multiplication = new Multiplication();
                            multiplication.action(a, b);
                            break;
                    }
                } else {
                    System.out.println("Неверный ввод");

                }

            } else if (choice == 2) {
                System.out.println("До скорой встречи!");
                return;


            } else {
                System.out.println("Неверный ввод. Повторите");
            }
        }

    }
}