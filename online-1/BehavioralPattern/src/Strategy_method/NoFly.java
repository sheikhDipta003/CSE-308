package Strategy_method;

public class NoFly implements IFly{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
