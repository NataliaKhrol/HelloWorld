import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������������� ��� � ������ ������������!");
        while (true) {
            int choice = chooseMenuItem(scanner);

            if (choice == 1) {
                int a = chooseNumber(scanner, "a");
                int b = chooseNumber(scanner, "b");
                scanner.nextLine();
                System.out.println("������� �����.��������");
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
                    System.out.println("�������� ����");
                }

            } else if (choice == 2) {
                System.out.println("�� ������ �������!");
                return;
            }
        }

    }

    private int chooseMenuItem(Scanner scan) {
        while (true) {
            System.out.println("�������� ���� �����:");
            System.out.println("  1. ������� �������������� ��������\n  2. �����");//\n ������� ������

            try {
                int itemNumber = scan.nextInt();
                if (itemNumber >= 1 && itemNumber <= 2) {
                    return itemNumber;
                }
            } catch (InputMismatchException e) {
                //read wrong input and skip it
                scan.nextLine();
            }

            System.err.println("Wrong input. Try again.");
            System.err.flush();
        }
    }

    private int chooseNumber(Scanner scanner, String label) {
        while (true) {
            System.out.println("������� �����:" + label + ":");
            try {
                int num = scanner.nextInt();
                return num;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            System.err.println("������ �����, ���������");
        }
    }
}



