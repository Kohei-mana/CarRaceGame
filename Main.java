public class Main {
    public static void main(String[] args) {
        //各自動車のインスタンス化
        Honda h = new Honda();
        Nissan n = new Nissan();
        Ferrari f = new Ferrari();
        Calc calc = new Calc();
        Race race = new Race();

        h.ridePerson();
        h.ridePerson();
        race.start(10000);


        //----------------------------------------------------------------------------------------
    
        //Q2 フェラーリクラスのリフトアップ・リフトダウンメソッドの確認
        // System.out.println("リフトアップする前の加速値：" + f.acceleration);
        // System.out.println(f.lift);
        // System.out.println("リフトaアップする前の車高の値：" + f.height);
        // f.liftUp();
        // System.out.println("リフトアップした後の加速値：" + f.acceleration);
        // System.out.println(f.lift);
        // System.out.println("リフトアップした後の車高の値：" + f.height);
        // f.liftDown();
        // System.out.println("リフトダウンした後の加速値：" + f.acceleration);
        // System.out.println(f.lift);
        // System.out.println("リフトダウンした後の車高の値：" + f.height);
        // f.liftUp();
        // f.liftUp();
        // System.out.println("リフトアップを連続で呼び出しても値に異常がないかの確認");
        // System.out.println(f.acceleration);
        // System.out.println(f.lift);
        // System.out.println(f.height);
        //--------------------------------------------------------------------------------------------        
        
        // Q3 各自動車をランダムに生成するメソッド、ランダムに生成された自動車の合計・平均金額を求めるメソッドの確認
        // System.out.println(calc.carRandomCnt);
        // System.out.println(calc.priceList);
        // calc.makeHondaRondom();
        // System.out.println(calc.carRandomCnt);
        // System.out.println(calc.priceList);
        // System.out.println(calc.priceList.size());
        // calc.makeNissanRondom();
        // System.out.println(calc.carRandomCnt);
        // System.out.println(calc.priceList);
        // System.out.println(calc.priceList.size());
        // calc.makeFerrariRondom();
        // System.out.println(calc.carRandomCnt);
        // System.out.println(calc.priceList);
        // System.out.println(calc.priceList.size());
        // System.out.println("合計関数");
        // System.out.println(calc.sumPrice);
        // calc.calcSumPrice();
        // System.out.println(calc.sumPrice);
        // System.out.println("平均関数");
        // calc.calcAvgPrice();
        // System.out.println(calc.avgPrice);

        //Q4 ridePersonメソッド(Ferrariクラスでの確認)
        // System.out.println("人をひとりも乗せていない場合の乗客人数と加速値");
        // System.out.println(f.peopleNum);
        // System.out.println(f.acceleration);
        // f.ridePerson();
        // System.out.println("人を１人乗せた場合と2人乗せた場合の乗客人数と加速値");
        // System.out.println(f.peopleNum);
        // System.out.println(f.acceleration);
        // f.ridePerson();
        // System.out.println(f.peopleNum);
        // System.out.println(f.acceleration);
        // System.out.println("乗客人数が定員数を超えた後の乗客数と加速値");
        // f.ridePerson();
        // System.out.println(f.peopleNum);
        // System.out.println(f.acceleration);
        // f.ridePerson();
        // System.out.println(f.peopleNum);
        // System .out.println(f.acceleration);
        // //Q4　Nissanクラスの生産時欠陥の実装を確認
        // System.out.println("------------------------------------------------");
        // System.out.println("Nissanの加速値");
        // System.out.println(n.acceleration);

        //Q6----------------------------------------------------------------------------------------------------------
        // Toyota t = new Toyota(4000000);
        // System.out.println("Toyotaの価格："+ t.getPrice());
        // System.out.println("Toyotaの加速:" + t.getAcceleration());
        
    }
}