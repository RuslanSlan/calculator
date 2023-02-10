import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write first number: ");
        int a = scan.nextInt();
        System.out.print("Write second number: ");
        int b = scan.nextInt();
        System.out.print("Choose operation (+, -, *, /): ");
        String operation = scan.next();
        switch (operation) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                float z = b;
                System.out.println(a / z);
                break;
            }
        }
    }
}
