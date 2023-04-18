import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Calc {

    private Random rand = new Random();
    // List<Integer> priceList = new ArrayList<Integer>();
    private int sumPrice;
    private double avgPrice;
    

    //各自動車をランダム(1~20台)に生成し、それぞれにランダムな値段をつけてリストに格納していくメソッド
    public void calcSumPrice(int num, int Price) {
        this.sumPrice = num * Price;
    }
    // public void calcSumPrice() {
    //     for(int i=0; i<this.priceList.size(); i++){
    //         this.sumPrice += this.priceList.get(i);
    //     }
    // }
    public void calcAvgPrice(int num) {
        this.avgPrice = this.sumPrice/num;
    }
}
