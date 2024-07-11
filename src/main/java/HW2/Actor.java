package HW2;

public abstract class Actor implements ActorBehaviour {
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected String name = "sda";

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
