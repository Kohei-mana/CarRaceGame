import java.util.Random;

public class Nissan extends Car {
    private Random rand = new Random();
    private int price = 2000000;
    private double acceleration = 4.0;

    //コンストラクタ
    public Nissan() {
        //Nissanの値段が百万~3百万円を想定
        this.price = rand.nextInt(2000000)+1000000;
        //生産時の欠陥発生処理
        this.acceleration *= 0.6;
    }
    
    //メソッド
    
    
    
}