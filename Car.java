public class Car {
    //すべての車に備わっているデフォルトの定員数、価格、加速、速度
    String name;
    int capacity;
    int price;
    double acceleration;

    Car(String name, int capacity, int price, double acceleration) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.acceleration = acceleration;
    }


    void stepAccel(){
        System.out.println("アクセルを踏みました");
    }

    void stepBrake() {
        System.out.println("ブレーキを踏みました");
    }
}

