import java.util.Scanner;

public class Menu {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������������� ��� � ������ ������������!");
        while (true) {
            System.out.println("�������� ���� �����:");
            System.out.println("  1. ������� �������������� ��������\n  2. �����");//\n ������� ������
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("������� ������ �����: ");
                int a = scanner.nextInt();
                System.out.println("������� ������ �����");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("������� �������� +;  -; *; /");
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


            } else {
                System.out.println("�������� ����. ���������");
            }
        }

    }
}