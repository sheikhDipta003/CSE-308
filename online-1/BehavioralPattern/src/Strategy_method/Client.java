package Strategy_method;

public class Client {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck._fly();

        duck = new MountainDuck();
        duck._fly();

        duck = new RubberDuck();
        duck._fly();
    }
}
