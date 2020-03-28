package practice.day1;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Aera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape shape;
        int flag = 0;
        while(true)
        {
            System.out.println("请输入编号选择计算的形状:0.退出   1.三角形   2.圆形    3.矩形");
            flag = in.nextInt();
            if(flag == 1) {
                System.out.println("请输入三条边长(空格隔开)：");
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                shape = new Triangle(a,b,c);
                shape.aera();
            }
            else if(flag == 2) {
                System.out.println("请输入半径：");
                int r = in.nextInt();
                shape = new Circle(r);
                shape.aera();
            }
            else if(flag == 3){
                System.out.println("请输入高和宽（空格隔开）：");
                int height = in.nextInt();
                int width = in.nextInt();
                shape = new Rectangle(height,width);
                shape.aera();
            }
            else if(flag == 0) {
                System.out.println("结束！");
                break;
            }
        }
    }
}
