package practice.day1;

public class Triangle implements Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void aera() {
        int cir;
        cir = a + b + c;
        int resault = (int) Math.sqrt(cir * (cir - a) * (cir - b) * (cir - c));
        System.out.println("三角形的面积是：" + resault);
    }
}
