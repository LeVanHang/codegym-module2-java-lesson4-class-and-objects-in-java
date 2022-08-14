import java.util.Scanner;

public class Fan {
    Double width;
    Double height;

    public Fan(double width, double height) {
    }

    public Fan() {
    }

    public Fan(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fan{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextInt();

        double height = scanner.nextInt();

        Fan fan = new Fan(width, height);

        System.out.println(fan.toString());
        System.out.println(fan.getArea());
        System.out.println(fan.getPerimeter());


    }
}
