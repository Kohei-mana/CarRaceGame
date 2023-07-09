import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Calc {

    private double sumPrice;
    private double avgPrice;
    
    //生成された自動車の価格の合計を計算するメソッド
    public double calcSumPrice(List<Integer> priceList) {
        for(int i=0; i<priceList.size(); i++){
            this.sumPrice += priceList.get(i);
        }
        return this.sumPrice;
    }
    //生成された自動車の価格の平均を計算するメソッド
    public double calcAvgPrice(List<Integer> priceList) {
        for(int i=0; i<priceList.size(); i++){
            this.sumPrice += priceList.get(i);
            this.avgPrice = this.sumPrice/priceList.get(i);
        }
        return this.avgPrice;
    }

}
