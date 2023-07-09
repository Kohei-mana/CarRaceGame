public class Toyota extends Car {
    private int capacity = 4;
    private int price;
    private int peopleNum = 0;
    private double acceleration;

    public Toyota(int price) {
        this.acceleration = price/1200000;
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public double getAcceleration(){
        return this.acceleration;
    }
    
    
}