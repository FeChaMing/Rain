package practice.day4;

import java.io.File;
import java.util.Scanner;

public class Traversal_Cdisk {
    public static void main(String[] args) {
        System.out.println("请输入遍历文件路径");
        traversal(new Scanner(System.in).nextLine());
    }
    public static void traversal(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        File maxF,minF;
        maxF = files[0];minF = files[0];
        for (int i = 1; i < files.length; i++) {
            if(maxF.length() < files[i].length())
                maxF = files[i];
            if(minF.length() > files[i].length())
                minF = files[i];
        }
        System.out.println("最小文件是：" + minF.getName() + "  最大文件是：" + maxF.getName());
    }
}
