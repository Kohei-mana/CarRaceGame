public class Q2 {
    public void main(String[] args) {
    }
    public void q2() {
        Ferrari f = new Ferrari();
        //Q2 フェラーリクラスのリフトアップ・リフトダウンメソッドの確認
        System.out.println("リフトアップする前の加速値：" + f.getAcceleration());
        System.out.println(f.getLift());
        System.out.println("リフトアップする前の車高の値：" + f.getAcceleration());
        f.liftUp();
        System.out.println("リフトアップした後の加速値：" + f.getAcceleration());
        System.out.println(f.getLift());
        System.out.println("リフトアップした後の車高の値：" + f.getAcceleration());
        f.liftDown();
        System.out.println("リフトダウンした後の加速値：" + f.getAcceleration());
        System.out.println(f.getLift());
        System.out.println("リフトダウンした後の車高の値：" + f.getAcceleration());
        f.liftUp();
        f.liftUp();
        System.out.println("リフトアップを連続で呼び出しても値に異常がないかの確認");
        System.out.println(f.getAcceleration());
        System.out.println(f.getLift());
        System.out.println(f.getAcceleration());
    }
}
