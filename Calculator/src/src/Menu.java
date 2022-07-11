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
                int a;
                do {
                    System.out.println("Введите положительное число a");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Неверный ввод. Повторите");
                        scanner.next();
                    }
                     a = scanner.nextInt();
                } while (a <= 0);
                System.out.println("a = " + a);

                int b;
                do {
                    System.out.println("Введите положительное число b");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Неверный ввод. Повторите");
                        scanner.next();
                    }
                    b = scanner.nextInt();
                } while (b <= 0);
                System.out.println("b = " + b);
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