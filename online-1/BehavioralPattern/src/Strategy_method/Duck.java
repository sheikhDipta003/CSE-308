package Strategy_method;

public class Duck {
    protected IFly f;
    Duck(IFly f){this.f = f;}
    void _fly(){
        f.fly();
    }
}
