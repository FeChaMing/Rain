package practice.day1;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void aera() {
        int aera = height * width;
        System.out.println("矩形面积是：" + aera);
    }
}
