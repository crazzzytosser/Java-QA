package HW1;

public class BottleofWater extends Product {
    private int volume;

    public BottleofWater(String name, int price) {
        super(name, price);
    }

    public BottleofWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleofWater{" +
                "volume=" + volume +
                '}';
    }
}
