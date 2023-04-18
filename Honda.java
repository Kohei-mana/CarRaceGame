import java.util.Random;


public class Honda extends Car {
    Random rand = new Random();
    private int capacity = 4;
    private int price;
    private int peopleNum;
    private double acceleration = 4.0;
    private double speed;
    private double maxSpeed = 100*1000/(60*60);
    private double distance;
    private double vO= 0;
    // private boolean isMaxSpeed = false;
    
    //コンストラクタ
    public Honda(){
        //Hondaの値段が4百万~6百万を想定
        this.price = rand.nextInt(2000000)+4000000;
    }
    //メソッド
    public int getPrice() {
        return this.price;
    }
    public double getSpeed(){
        return this.maxSpeed;
    }
    public double getAcceleration(){
        return this.acceleration;
    }
    public double getDistance(){
        return this.distance;
    }
    public double getMaxSpeed() {
        return this.maxSpeed;
    }
    
    
    //
    public void stepAccel(int sec){
        // System.out.println(sec + "秒アクセルを踏みました。");
        this.distance = this.acceleration*this.maxSpeed*sec;

        
        // double maxSec = this.maxSpeed/this.acceleration;
        // while(this.speed < this.maxSpeed) {
        //     this.speed = this.acceleration*sec + this.vO;
        //     distance = 1/2 * this.acceleration*(sec*sec) + this.vO*sec;
        //     this.sumDistance += distance;
        //     this.vO = this.speed;
        //     if(this.speed > this.maxSpeed){
        //         this.speed = this.maxSpeed;
        //         distance = this.speed * sec;
        //         this.sumDistance += distance;
        //     }
        // }
    }
    public  void stepBrake(int sec) {
        

    //     // double distance;
    //     // System.out.println(sec + "秒ブレーキを踏みました。");
    //     // this.speed = this.acceleration*(-1)*sec + vO*sec;
    //     // distance = 1/2 * this.acceleration*(-1)*(sec*sec) + vO*sec;
    //     // this.vO = this.speed;
    //     // this.sumDistance += distance;
    }
    
}

    // double speedHour = 100km/h;
    //
    // double speedSec = speedHour*km / 3600 m/s;
    // 100km/h = 27.8m/s
    // 加速 = 4.0 m/s^2
    // 毎秒、秒速4mずつ早くなる
    // 27.8/4.0 = 6.95秒で100km/hに
    // 6.95秒で？mは無理

    // 時速を秒速に変換する関数
    // public void speedHourToSec() {
        // this.speedSec = (100*1000)/(60*60)
        // 
    // }