public class Ferrari implements Car {
    int capacity = 2;
    int price = 12000000;
    double acceleration = 8;
    int height;
    

    public void stepAccel(){
        System.out.println("アクセルを踏みました。");
    }
    public void stepBrake(){
        System.out.println("ブレーキを踏みました。");
    }

    boolean lift = false;

    //リフトアップメソッド→リフトアップすると20%加速が低下する。リフトアップしている状態から呼び出しても何も起こらない。
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
