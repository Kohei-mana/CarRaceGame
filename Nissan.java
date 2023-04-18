import java.util.Random;

public class Nissan extends Car {
    private Random rand = new Random();
    private int capacity = 6;
    private int price = 2000000;
    private double acceleration = 4.0;
    private int peopleNum = 0;
    private double speed;
    private double maxSpeed = 100*1000/(60*60);
    private double distance;
    private double vO= 0;

    //コンストラクタ
    public Nissan() {
        //Nissanの値段が百万~3百万円を想定
        this.price = rand.nextInt(2000000)+1000000;
        //生産時の欠陥発生処理
        this.acceleration *= 0.6;
    }
    
    //メソッド
    public int getPrice() {
        return this.price;
    }

    public double getDistance(){
        return this.distance;
    }
    public double getAcceleration(){
        return this.acceleration;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void stepAccel(int sec){
        this.distance = this.acceleration*this.maxSpeed*sec;
    }
    
}