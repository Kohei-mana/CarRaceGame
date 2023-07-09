public class Main {
    public static void main(String[] args) {
        
        // Car[] cars = new Car[3];
        // cars[0] = new Honda();
        // cars[1] = new Nissan();
        // cars[2] = new Ferrari();

        // for (Car car : cars) {
        //     System.out.println(car.name + "の価格：" + car.price);

        // }

        MakeCars make = new MakeCars();
        Calc calc = new Calc();
        
        make.makeCars("Honda");
        make.makeCars("Nissan");
        make.makeCars("Ferrari");
        System.out.println(make.priceList);
        System.out.println(calc.calcSumPrice(make.priceList));
        System.out.println(calc.calcAvgPrice(make.priceList));
        
    }
}