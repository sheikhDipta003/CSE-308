package Strategy_method;

public class MountainDuck extends Duck{
    MountainDuck() {
        super(new HighFly());
    }
}
