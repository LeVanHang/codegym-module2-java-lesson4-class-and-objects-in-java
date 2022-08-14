import java.util.Scanner;

public class QuadraticMain {
    public QuadraticMain(double a, double b, double c) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input a: ");
        double a = scanner.nextDouble();

        System.out.println("input b: ");
        double b = scanner.nextDouble();

        System.out.println("input c: ");
        double c = scanner.nextDouble();

        QuadraticMain quadraticMain = new QuadraticMain(a, b, c);
        double delta = quadraticMain.getDiscriminant();
        if (delta > 0) {
            System.out.println("pt 2 nghiem");
        } else if (delta == 0) {
            System.out.println("pt 1 nghiem");
        } else {
            System.out.println("The equation has no roots");
        }
    }

    private double getDiscriminant() {
        return 0;
    }
}
