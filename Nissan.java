class Nissan extends Car {
    Nissan() {
        super("Nissan", 4, 4000000, 4.0);
        //生産時の欠陥が発生し、加速値の60%しか性能がだせない。
        this.acceleration *= 0.6;
    }
}