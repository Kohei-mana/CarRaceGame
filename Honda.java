public class Honda implements Car {
    int capacity = 4;
    int price = 5000000;
    double acceleration = 4.0;
    int peopleNum = 0;

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