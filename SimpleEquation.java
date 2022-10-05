import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        double a, b, c, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.print("c: ");
        c = scanner.nextDouble();

        if (a != 0 ) {
            result = (c - b) / a;
            System.out.println("Phuong trinh co nghiem: " + result);
        } else {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
