import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Race {
    Random rand = new Random();
    Honda h = new Honda();
    Nissan n = new Nissan();
    Ferrari f = new Ferrari();
    Toyota t = new Toyota(4000000);
    int m = 1000;
    List<String> goalList = new ArrayList<>();





    public void start(int distance) {
        
        System.out.println("ゴールは" + distance);

        //途中経過の出力

        double hondaTime = distance/h.getMaxSpeed()/h.getAcceleration();
        double nissanTime = distance/n.getMaxSpeed()/n.getAcceleration();
        double ferrariTime = distance/f.getMaxSpeed()/f.getAcceleration();
        double toyotaTime = distance/t.getMaxSpeed()/t.getAcceleration();

        for(int s=60; s<1000; s=s+60){
            h.stepAccel(s);
            int brakeSec = rand.nextInt(5);
            h.stepBrake(brakeSec);
            System.out.println("ホンダの" + s + "秒後の距離");
            System.out.println(h.getDistance());
            if(distance<h.getDistance()){
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + hondaTime + "秒です");
                break;
            }
        }

        //ニッサンの走り
        for(int s=60; s<1000; s=s+60){
            n.stepAccel(s);
            int brakeSec = rand.nextInt(5);
            n.stepBrake(brakeSec);
            System.out.println("ニッサンの" + s + "秒後の距離");
            System.out.println(n.getDistance());
            if(distance<n.getDistance()){
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + nissanTime + "秒です");
                break;
            }
        }

        for(int s=60; s<1000; s=s+60){
            f.stepAccel(s);
            int brakeSec = rand.nextInt(5);
            f.stepBrake(brakeSec);
            System.out.println("フェラーリの" + s + "秒後の距離");
            System.out.println(f.getDistance());
            if(distance<f.getDistance()){
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + ferrariTime + "秒です");
                break;
            }
        }

        for(int s=30; s<1000; s=s+60){
            t.stepAccel(s);
            int brakeSec = rand.nextInt(5);
            t.stepBrake(brakeSec);
            System.out.println("トヨタの" + s + "秒後の距離");
            System.out.println(t.getDistance());
            if(distance<t.getDistance()){
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + toyotaTime + "秒です");
                break;
            }
        }

        ///順位決定
        double[] cars = {hondaTime, nissanTime, ferrariTime, toyotaTime};
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        System.out.println("ホンダのタイム:" + hondaTime);
        System.out.println("ニッサンのタイム:" + nissanTime);
        System.out.println("フェラーリのタイム:" + ferrariTime);
        System.out.println("トヨタのタイム:" + toyotaTime);

        for(int i=0;i<cars.length;i++){
            System.out.println(i+1 + "位：" + cars[i]);
        }

        
    }
        
    
}
// && n.distance<distance && f.distance<distance && t.distance<distance
