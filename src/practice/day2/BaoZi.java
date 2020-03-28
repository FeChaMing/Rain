package practice.day2;

public class BaoZi {
    private String pi;
    private String xian;
    public boolean flag = false;
    public BaoZi(){
    }
    public BaoZi(String pi,String xian){
        this.pi = pi;
        this.xian = xian;
    }
    public void setPi(String pi){
        this.pi = pi;
    }
    public void setXian(String xian){
        this.xian = xian;
    }
    public String getPi(){
        return pi;
    }
    public String getXian(){
        return xian;
    }
}
