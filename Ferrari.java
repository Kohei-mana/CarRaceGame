public class Ferrari implements Car {
    int capacity = 2;
    int price = 10000000;
    double acceleration = 8.0;
    int peopleNum = 0;
    //Q2 車高をリフトアップしているかどうかの真偽
    boolean lift = false;
    //Q2 車高のデフォルトの値
    int height = 0;
    
    public void stepAccel(){
        System.out.println("アクセルを踏みました。");
    }
    public void stepBrake(){
        System.out.println("ブレーキを踏みました。");
    }
    public void ridePerson(){
        if(this.peopleNum<this.capacity){
            this.acceleration *= (1 - 0.05);
            this.peopleNum += 1;
        }
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
    //
    public void liftDown() {
        if(this.lift == true) {
            this.acceleration = 8;
            this.lift = false; 
            this.height = 0;
        }
    }

}
