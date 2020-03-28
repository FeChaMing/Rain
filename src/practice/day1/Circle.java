package practice.day1;

public class Circle implements Shape{
    private double r;
    private static final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void aera() {
        double aera = r * r * PI;
        System.out.println("圆形面积是：" + aera);
    }
}

