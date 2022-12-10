package State_Pattern;

interface State {
    Snake snake = new Snake();
    void setFoodInt();
    void setSpeed();
    void setPointsCalc();
    void ChangeState(Context cxt);
}
