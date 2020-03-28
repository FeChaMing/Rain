package practice.day2;

public class BaoziPu implements Runnable{
    private BaoZi bz;
    public BaoziPu(BaoZi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.setPi("冰皮");
                    bz.setXian("三鲜");
                } else {
                    bz.setPi("薄皮");
                    bz.setXian("猪肉大葱");
                }
                count++;
                System.out.println("包子铺正在生产" + bz.getPi() + bz.getXian());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产好" + bz.getPi() + bz.getXian() + "了,吃货可以开吃了");
            }
        }
    }
}
