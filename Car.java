public interface Car {
    //すべての車に備わっているデフォルトの定員数、価格、加速、速度
    int capacity = 4;
    int price = 4000000;
    int acceleration = 4;

    //アクセル、ブレーキメソッド
    void stepAccel();
    void stepBrake();
}