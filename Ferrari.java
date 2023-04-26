import java.util.Random;

public class Ferrari extends Car {
    Random rand = new Random();
    private int capacity = 2;
    private int price = 10000000;
    private double acceleration = 8.0;

    //Q2 車高をリフトアップしているかどうかの真偽
    private boolean lift = false;
    //Q2 車高のデフォルトの値
    private int height;

    public Ferrari(){
        //Hondaの値段が8百万~1000万を想定
        this.price = rand.nextInt(2000000)+8000000;
    }
    public double getAcceleration() {
        return this.acceleration;
    }
    //Q2
    public boolean getLift() {
        return this.lift;
    }
    public int getHeight(){
        return this.height;
    }

    public double stepAccel(int sec){
        double distance =  this.acceleration * (sec*sec) /2;
        return distance;
    }
    public double stepBrake(int sec){
        double distance =  this.acceleration * (sec*sec) /2/2;
        return distance;
    }
    

    //Q2　リフトアップメソッド→リフトアップすると20%加速が低下する。リフトアップしている状態から呼び出しても何も起こらない。
    public void liftUp() {
        if(this.lift == false) {
            //加速20%低下
            this.acceleration *= (1 - 0.2);
            this.lift = true;
            this.height = 40;
        }
    }
    public void liftDown() {
        if(this.lift == true) {
            this.acceleration /= (1 - 0.2);
            this.lift = false; 
            this.height = 0;
        }
    }

}
