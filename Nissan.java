public class Nissan implements Car {
    int capacity = 6;
    int price = 2000000;
    double acceleration = 4.0;
    int peopleNum = 0;

    //コンストラクタ
    public Nissan() {
        //生産時の欠陥発生処理
        this.acceleration *= 0.6;
    }
    //メソッド
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
}