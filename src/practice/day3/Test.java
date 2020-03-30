package practice.day3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        Account person = null;
        while(true) {
            flag = 0;
            System.out.println("请选择："+"\r\n"+"1.开户 2.取钱 " + "\r\n" + "3.存钱 4.查询余额 " + "\r\n" + "5.退出");
            flag = in.nextInt();
            switch (flag) {
                case 1:
                    System.out.println("请输入开户名与开户额");
                    person = new Account(in.next(), in.nextDouble());
                    break;
                case 2:
                    if (person == null) {
                        System.out.println("你还未开户！！");
                        break;
                    }
                    System.out.println("请输入取出金额：");
                    try {
                        person.withdraw(in.nextDouble());
                        System.out.println("取出成功！");
                    } catch (Account.overLimit overLimit) {
                        overLimit.printStackTrace();
                    }
                    break;
                case 3:
                    if (person == null) {
                        System.out.println("你还为开户！！");
                        break;
                    }
                    System.out.println("请输入");
                    person.deposit(in.nextDouble());
                    System.out.println("成功存入");
                    break;
                case 4:
                    if (person == null) {
                        System.out.println("你还为开户！！");
                        break;
                    }
                    System.out.println("查询成功！");
                    System.out.println("您的账户余额为：" + person.getBalance());
                    break;
                default:
                    flag = 5;
            }
            if (flag == 5)
                break;
        }
    }
}
