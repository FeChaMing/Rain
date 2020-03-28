package practice.day2;

public class ThreadTestPractices {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new Thread(new ChiHuo(bz)).start();
        new Thread(new BaoziPu(bz)).start();
    }
}
