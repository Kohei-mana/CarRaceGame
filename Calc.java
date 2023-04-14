import java.util.Random;
import java.util.ArrayList;

public class Calc {

    Random rand = new Random();
    int carRandomCnt;
    ArrayList<Integer> priceList = new ArrayList<Integer>();
    int sumPrice;
    int avgPrice;

    //各自動車をランダム(1~20台)に生成し、それぞれにランダムな値段をつけていくメソッド
    public void makeHondaRondom() {
        this.carRandomCnt = rand.nextInt(20)+1;
        for(int i=0; i<this.carRandomCnt; i++){
            Honda h = new Honda();
            //Hondaの値段が4百万~6百万を想定
            h.price = rand.nextInt(2000000)+4000000;
            this.priceList.add(h.price);
        }
    }
    public void makeNissanRondom() {
        for(int i=0; i<this.carRandomCnt; i++){
            Nissan n = new Nissan();
            //Nissanの値段が百万~２百万円を想定
            n.price = rand.nextInt(2000000)+1000000;
            this.priceList.add(n.price);
        }
    }
    public void makeFerrariRondom() {
        this.carRandomCnt = rand.nextInt(20)+1;
        for(int i=0; i<this.carRandomCnt; i++){
            Ferrari f = new Ferrari();
            //フェラーリの値段が1千万~1.2千万を想定
            f.price = rand.nextInt(2000000)+10000000;
            this.priceList.add(f.price);
        }
    }
    public void calcSumPrice() {
        for(int i=0; i<priceList.size(); i++) {
            this.sumPrice += priceList.get(i);
        }
    }
    public void calcAvgPrice() {
        this.avgPrice = this.sumPrice / priceList.size();
    }
}
