public class Ferrari extends Car {
    private int capacity = 2;
    private int price = 10000000;
    private double acceleration = 8.0;
    private int peopleNum = 0;
    private double speed;
    private double maxSpeed = 160*1000/(60*60);
    private double sumDistance;
    private double vO= 0;
    private double distance;
    //Q2 車高をリフトアップしているかどうかの真偽
    private boolean lift = false;
    //Q2 車高のデフォルトの値
    private int height = 0;
    

    public int getPrice() {
        return this.price;
    }
    public double getDistance() {
        return this.distance;
    }
    public double getAcceleration(){
        return this.acceleration;
    }
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void stepAccel(int sec){
        this.distance = this.acceleration*this.maxSpeed*sec;
    }
    // public void stepAccel(int sec){
    //     System.out.println(sec + "秒アクセルを踏みました。");
    //     double distance;
    //     double maxSec = this.maxSpeed/this.acceleration;
    //     while(this.speed < this.maxSpeed) {
    //         this.speed = this.acceleration*sec + this.vO;
    //         distance = 1/2 * this.acceleration*(sec*sec) + this.vO*sec;
    //         this.sumDistance += distance;
    //         this.vO = this.speed;
    //         if(this.speed > this.maxSpeed){
    //             this.speed = this.maxSpeed;
    //             distance = this.speed * sec;
    //             this.sumDistance += distance;
    //         }
    //     }
    // }
    // public  void stepBrake(int sec) {
    //     double distance;
    //     System.out.println(sec + "秒ブレーキを踏みました。");
    //     this.speed = this.acceleration*(-1)*sec + vO*sec;
    //     distance = 1/2 * this.acceleration*(-1)*(sec*sec) + vO*sec;
    //     this.vO = this.speed;
    //     this.sumDistance += distance;
    // }

    //Q2　リフトアップメソッド→リフトアップすると20%加速が低下する。リフトアップしている状態から呼び出しても何も起こらない。
    public void liftUp() {
        if(this.lift == false) {
            //加速20%低下
            this.acceleration *= (1 - 0.2);
            this.lift = true;
            this.height = 40;
        }
    }
    //
    public void liftDown() {
        if(this.lift == true) {
            this.acceleration = 8;
            this.lift = false; 
            this.height = 0;
        }
    }

}
