public interface Car {
    //すべての車に備わっているデフォルトの定員数、価格、加速、速度
    int capacity = 4;
    int price = 4000000;
    double acceleration = 4.0;

    //アクセル、ブレーキメソッド
    void stepAccel();
    void stepBrake();
    void ridePerson();
}