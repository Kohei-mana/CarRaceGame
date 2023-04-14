public class Nissan implements Car {
    int capacity = 6;
    int price = 2000000;
    int acceleration = 4;

    public void stepAccel(){
        System.out.println("アクセルを踏みました。");
    }
    public void stepBrake(){
        System.out.println("ブレーキを踏みました。");
    }
}