import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рады приветствовать Вас в онлайн Калькуляторе!");

        ResultOperationHistory history = new SimpleResultHistory();

        while (true) {
            int choice = itemNumber(scanner);

            if (choice == 1) {
                int a = chooseNumber(scanner, "a");
                int b = chooseNumber(scanner, "b");

                scanner.nextLine();
                System.out.println("Введите операцию +;  -; *; /");
                String c = scanner.nextLine();


                if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                    int result;
                    switch (c) {
                        case "-":
                            Minus minus = new Minus();
                            result = minus.action(a, b);
                            break;
                        case "+":
                            Sum sum = new Sum();
                            result = sum.action(a, b);
                            break;
                        case "/":
                            Div div = new Div();
                            result = div.action(a, b);
                            break;
                        case "*":
                            Multiplication multiplication = new Multiplication();
                            result = multiplication.action(a, b);
                            break;
                        default: //если выпадет иная мат.операция чем оговорены выше
                            throw new RuntimeException();
                    }
                    System.out.println(result);
                    history.addToHistory(result);

                } else {
                    System.out.println("Неверный ввод");

                }

            } else if (choice == 2) {
                System.out.println("До скорой встречи!");
                return;
            } else if (choice == 3) {
                if (history == null) {
                    System.out.println("Сорри, эта операция пока не поддерживается");
                } else {
                    history.printHistory();
                }

            } else {
                System.out.println("Неверный ввод. Повторите");
            }
        }
    }

    private int chooseNumber(Scanner scanner, String symbol) {

        int number;

        do {
            System.out.println("Введите положительное число " + symbol + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный ввод. Повторите");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println(symbol + " = " + number);

        return number;
    }

    private int itemNumber(Scanner scanner) {
        while (true) {
            System.out.println("Сделайте свой выбор:");
            System.out.println(" 1. Решение математической операции\n 2. Выход");//\n перенос строки
            System.out.println(" 3. Распечатать предыдущие результаты");
            try {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }

            } catch (InputMismatchException e) {
                scanner.nextLine();

            }
            System.err.println("Неправильный ввод. Повторите");
            System.err.flush();//очищает буфер..а нужен ли он мне тут..
        }
    }
}



