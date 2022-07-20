import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������������� ��� � ������ ������������!");

        ResultOperationHistory history = new SimpleResultHistory();

        while (true) {
            int choice = itemNumber(scanner);

            if (choice == 1) {
                int a = chooseNumber(scanner, "a");
                int b = chooseNumber(scanner, "b");

                scanner.nextLine();
                System.out.println("������� �������� +;  -; *; /");
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
                        default: //���� ������� ���� ���.�������� ��� ��������� ����
                            throw new RuntimeException();
                    }
                    System.out.println(result);
                    history.addToHistory(result);

                } else {
                    System.out.println("�������� ����");

                }

            } else if (choice == 2) {
                System.out.println("�� ������ �������!");
                return;
            } else if (choice == 3) {
                if (history == null) {
                    System.out.println("�����, ��� �������� ���� �� ��������������");
                } else {
                    history.printHistory();
                }

            } else {
                System.out.println("�������� ����. ���������");
            }
        }
    }

    private int chooseNumber(Scanner scanner, String symbol) {

        int number;

        do {
            System.out.println("������� ������������� ����� " + symbol + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("�������� ����. ���������");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println(symbol + " = " + number);

        return number;
    }

    private int itemNumber(Scanner scanner) {
        while (true) {
            System.out.println("�������� ���� �����:");
            System.out.println(" 1. ������� �������������� ��������\n 2. �����");//\n ������� ������
            System.out.println(" 3. ����������� ���������� ����������");
            try {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }

            } catch (InputMismatchException e) {
                scanner.nextLine();

            }
            System.err.println("������������ ����. ���������");
            System.err.flush();//������� �����..� ����� �� �� ��� ���..
        }
    }
}



