public abstract class Car {
    //すべての車に備わっているデフォルトの定員数、価格、加速、速度
    private int capacity;
    private int price;
    private double acceleration = 4.0;
    private double speed;
    private double maxSpeedHour = 100;
    //単位

    public double getSpeed() {
        return this.speed;
    }

    public double stepAccel(int sec){
        double distance;
        distance = this.acceleration * (sec*sec)/2;
        return distance;
    }
    
    // public double stepBrake(int sec) {
    // }

    public void ridePerson(int peopleNum){
        if(peopleNum>this.capacity) {
            System.out.println("定員オーバーです");
        }
        if(peopleNum<=this.capacity){
            this.acceleration *= (1 - 0.05*peopleNum);
        }
    }
}

