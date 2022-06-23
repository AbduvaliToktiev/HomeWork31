import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите действие (+-*/): ");
        String action = sc.nextLine();
        System.out.print("Введите первое число: ");
        double num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextInt();
        switch (action) {
            case "+":
                num = num1 + num2;
                System.out.println(num);
                break;
            case "-":
                num = num1 - num2;
                System.out.println(num);
                break;
            case "*":
                num = num1 * num2;
                System.out.println(num);
                break;
            case "/":
                break;
            default:
        }
        try {
            num = num1 / num2;
            System.out.println(num);
            throw new MyException("{Ошибка деление на ноль!}");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
