import java.util.Scanner;

public class md2_rs_AreaRectengle {
    // định nghĩa class
    public static class Rectangle {
        double width, height;
    //contructor rổng
        public Rectangle() {
        }
        // contructor gồm hai tham số
        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        // phương thức
        public double getS(){
            return this.width * this.height;
        }
        public double getP(){
            return (this.width + this.height) * 2;
        }
//        public String display(){
//            return "Rectangle{" + "width=" + width + " height=" + height + "}";
//        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
//        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("P of the Rectangle: " + rectangle.getP());
        System.out.println("S of the Rectangle: " + rectangle.getS());
        System.out.println(rectangle.toString());
    }
}