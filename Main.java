public class Main {
    public static void main(String[] args) {
        //各自動車のインスタンス化
        Honda h = new Honda();
        Nissan n = new Nissan();
        Ferrari f = new Ferrari();
        Calc calc = new Calc();
        Race race = new Race();
        //各課題
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();


        race.race(10000);
        

        //Q6----------------------------------------------------------------------------------------------------------
        // Toyota t = new Toyota(4000000);
        // System.out.println("Toyotaの価格："+ t.getPrice());
        // System.out.println("Toyotaの加速:" + t.getAcceleration());
        
    }
}