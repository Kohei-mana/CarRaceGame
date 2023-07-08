public class Main {
    public static void main(String[] args) {
        
        Car[] cars = new Car[3];
        cars[0] = new Honda();
        cars[1] = new Nissan();
        cars[2] = new Ferrari();

        for (Car car : cars) {
            System.out.println(car.name + "の定員数は" + car.capacity + "で、価格は" + car.price + "円です。");
            System.out.println("加速度は" + car.acceleration + "です。");
        }
        
    }
}