import java.util.Random;
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


    //途中経過を出力するメソッド
    public void progress(int sec) {
        System.out.println(sec + "秒経過地点: " + f.stepAccel(sec) + "m");
    }
    public int makeBrakeCnt(){
        int brakeCnt = rand.nextInt(5);
        return brakeCnt;
    }
    public int makeBrakeSec(){
        int brakeSec = rand.nextInt(10);
        return brakeSec;
    }

    public void race(int distance) {
        
        System.out.println("ゴールは" + distance);

        //ホンダ
        for(int s=0; s<100; s++){
            h.stepAccel(s);
            if(s%10==0) {
                progress(s);
            }
            if(distance<=h.stepAccel(s)) {
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + s + "秒です！"); 
                break;
            }
        }
        
        //フェラーリ
        for(int s=0; s<100; s++){
            f.stepAccel(s);
            
            if(s%10==0) {
                progress(s);
            }
            if(distance<=f.stepAccel(s)) {
                System.out.println("ゴールしました！");
                System.out.println("タイムは" + s + "秒です！"); 
                int fTime = s;
                break;
            }
        }    
    }
        
    
}
