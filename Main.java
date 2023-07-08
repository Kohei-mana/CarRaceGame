public class Main {
    public static void main(String[] args) {
        
        Ferrari f = new Ferrari();

        //車高が上がってない状態でliftDownできないことを確認
        f.liftDown();
        System.out.println("車高上昇前");
        System.out.println(f.name + "の車高は" + f.frontHeight + "mm");
        System.out.println(f.name + "の加速は" + f.acceleration);
        f.liftUp();
        System.out.println("車高上昇後");
        System.out.println(f.name + "の車高は" + f.frontHeight + "mm");
        System.out.println(f.name + "の加速は" + f.acceleration);
        //車高が上がっている状態でliftUpできないことを確認する
        f.liftUp();
        f.liftDown();
        System.out.println("車高下降後");
        System.out.println(f.name + "の車高は" + f.frontHeight + "mm");
        System.out.println(f.name + "の加速は" + f.acceleration);
        
    }
}