import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Q3 {
    List<Integer> priceList = new ArrayList<Integer>();
    Random rand = new Random();

    public void main(String[] args) {
        
        Calc c = new Calc();
        // Q3 各自動車をランダムに生成するメソッド、ランダムに生成された自動車の合計・平均金額を求めるメソッドの確認
        
        //ランダムな価格をリストに格納する
        int randNum = rand.nextInt(20)+1;
        this.makeCarRandom();
        c.calcSumPrice(randNum, priceList);
        c.calcAvgPrice(randNum, priceList);
    }
    public void makeCarRandom(){
        int randNum = rand.nextInt(20)+1;
        for(int i=0; i<randNum; i++){
            Honda h = new Honda();
            Nissan n = new Nissan();
            Ferrari f = new Ferrari();
            this.priceList.add(h.getPrice());
            // priceList.add(n.getPrice());
            // priceList.add(f.getPrice());
        }

    }
    
}
