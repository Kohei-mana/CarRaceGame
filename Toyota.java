public class Toyota extends Car {
    private int capacity = 4;
    private int price;
    private int peopleNum = 0;
    private double acceleration = 4.0;
    private double speed;
    private double maxSpeed = 100*1000/(60*60);
    private double sumDistance;
    private double distance;
    private double vO= 0;

    public Toyota(int price) {
        this.acceleration = price/1200000;
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    public double getAcceleration(){
        return this.acceleration;
    }
    public double getDistance(){
        return this.distance;
    }
    
    
    public void stepAccel(int sec){
        this.distance = this.acceleration*this.maxSpeed*sec;
    }
    
}