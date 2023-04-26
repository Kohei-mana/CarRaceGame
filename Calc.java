import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Calc {

    private Random rand = new Random();
    // List<Integer> priceList = new ArrayList<Integer
    private double sumPrice;
    private double avgPrice;
    

    //各自動車をランダム(1~20台)に生成し、それぞれにランダムな値段をつけてリストに格納していくメソッド
    public double calcSumPrice(int num, List<Integer> priceList) {
        for(int i=1; i<=num; i++){
            this.sumPrice += priceList.get(i);
        }
        return this.sumPrice;
    }
    // 
    public double calcAvgPrice(int num, List<Integer> priceList) {
        for(int i=1; i<=num; i++){
            this.sumPrice += priceList.get(i);
            this.avgPrice = this.sumPrice/priceList.get(i);
        }
        return this.avgPrice;
    }

    // public void calcAvgPrice(int num) {
    //     this.avgPrice = this.sumPrice/num;
    // }
}
