import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class MakeCars {
    Random rand = new Random();

    //生成した自動車の価格を格納したリスト
    List<Integer> priceList = new ArrayList<>();

    //引数で指定したブランドの自動車を1~10台の間でランダムに生成するメソッド
    void makeCars(String name) {
        int randomCnt = rand.nextInt(10) + 1;
        if(name == "Honda"){
            Car[] carArray = new Car[randomCnt];
            for (int i = 0; i < randomCnt-1; i++) {
                carArray[i] = new Honda();
                priceList.add(carArray[i].price);
            }
        }
        if(name == "Nissan"){
            Car[] carArray = new Car[randomCnt];
            for (int i = 0; i < randomCnt-1; i++) {
                carArray[i] = new Nissan();
                priceList.add(carArray[i].price);
            }
        }
        if(name == "Ferrari"){
            Car[] carArray = new Car[randomCnt];
            for (int i = 0; i < randomCnt-1; i++) {
                carArray[i] = new Ferrari();
                priceList.add(carArray[i].price);
            }
        }

    }
}
