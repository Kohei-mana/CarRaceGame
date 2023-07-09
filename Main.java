public class Main {
    public static void main(String[] args) {
        
        Car[] cars = new Car[3];
        cars[0] = new Honda();
        cars[1] = new Nissan();
        cars[2] = new Ferrari();

        for (Car car : cars) {
            System.out.println("乗車前");
            System.out.println(car.name + "の加速：" + car.acceleration);
            car.ridePeople(3);
            System.out.println("乗車後");
            System.out.println(car.name + "の加速：" + car.acceleration);

        }

    }
}