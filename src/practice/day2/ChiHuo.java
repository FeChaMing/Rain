package practice.day2;

public class ChiHuo implements Runnable{
    private BaoZi bz;
    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + bz.getPi() + bz.getXian() + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
