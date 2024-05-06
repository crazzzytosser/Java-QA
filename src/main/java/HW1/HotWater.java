package HW1;

public class HotWater extends Product {

    private int temp;
    private int volume;

    public HotWater(String name, int price, int temp, int volume) {
        super(name, price);
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotWater{" +
                "temp=" + temp +
                ", volume=" + volume +
                '}';
    }
}
