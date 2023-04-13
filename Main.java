public class Main {
    public static void main(String[] args) {
        System.out.println();
        Honda h = new Honda();
        Nissan n = new Nissan();
        Ferrari f = new Ferrari();
        
        // System.out.println("Hondaで他の車より定員数が多い");
        // System.out.println(h.capacity > n.capacity && h.capacity > f.capacity);
        // System.out.println("Nissanで他の車より価格が安い");
        // System.out.println(n.price < h.price && n.price < f.price);
        // System.out.println("Ferrariで他の車より価格が高い");
        // System.out.println(f.price > n.price && f.price > h.price);
        // System.out.println("Ferrariで他の車より定員数が少ない");
        // System.out.println(n.capacity > f.capacity && h.capacity > f.capacity);
        // System.out.println("Ferrariで他の車より加速が早い");
        // System.out.println(f.acceleration > n.acceleration && f.acceleration > h.acceleration);
    
        //フェラーリクラスのリフトアップ・リフトダウンメソッドの確認
        System.out.println("リフトアップする前の加速値：" + f.acceleration);
        System.out.println(f.lift);
        System.out.println("リフトアップする前の車高の値：" + f.height);
        f.liftUp();
        System.out.println("リフトアップした後の加速値：" + f.acceleration);
        System.out.println(f.lift);
        System.out.println("リフトアップした後の車高の値：" + f.height);
        f.liftDown();
        System.out.println("リフトダウンした後の加速値：" + f.acceleration);
        System.out.println(f.lift);
        System.out.println("リフトダウンした後の車高の値：" + f.height);
        f.liftUp();
        f.liftUp();
        System.out.println("リフトアップを連続で呼び出しても値に異常がないかの確認");
        System.out.println(f.acceleration);
        System.out.println(f.lift);
        System.out.println(f.height);
        
        
        // h.stepAccel();
        // n.stepAccel();
        // f.stepAccel();
        // h.stepBrake();
        // n.stepBrake();
        // f.stepBrake();
        
    }
}