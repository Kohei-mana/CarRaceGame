public abstract class Car {
    //すべての車に備わっているデフォルトの定員数、価格、加速、速度
    private int capacity = 4;
    private int price = 4000000;
    private double acceleration = 4.0;
    private int peopleNum;
    private double speed;
    private double maxSpeed = 100*1000/(60*60);
    private double sumDistance;
    private double vO= 0;
    private double distance;
    // double speed;
    // 

    public double getSumDistance() {
        return this.sumDistance;
    }
    public double getDistance() {
        return this.distance;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    //アクセル、ブレーキメソッド
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

    public void stepAccel(int sec){
        // System.out.println(sec + "秒アクセルを踏みました。");
        this.distance = this.maxSpeed*sec;
    }
    public  void stepBrake(int sec) {
        this.distance += -20*sec;
    }



    // public  void stepBrake(int sec) {
    //     double distance;
    //     System.out.println(sec + "秒ブレーキを踏みました。");
    //     this.speed = this.acceleration*(-1)*sec + vO*sec;
    //     distance = 1/2 * this.acceleration*(-1)*(sec*sec) + vO*sec;
    //     this.vO = this.speed;
    //     this.sumDistance += distance;
    // }
    public void ridePerson(){
        if(this.peopleNum<this.capacity){
            this.acceleration *= (1 - 0.05);
            this.peopleNum += 1;
        }
    }
}
    //スピード・加速の単位を統一するメソッド

