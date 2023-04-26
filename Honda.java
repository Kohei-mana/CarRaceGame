import java.util.Random;

public class Honda extends Car {
    Random rand = new Random();
    private int capacity = 6;
    private int price;
    private double acceleration = 4.0;
    private double speed;
    
    //コンストラクタ
    public Honda(){
        //Hondaの値段が4百万~6百万を想定
        this.price = rand.nextInt(2000000)+4000000;
    }

    public int getPrice() {
        return price;
    }

    //メソッド
    public double stepAccel(int sec){
        double distance =  this.acceleration * (sec*sec) /2;
        return distance;
    }
    
}

    