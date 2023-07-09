class Ferrari extends Car {
    double frontHeight;
    boolean isLifted;

    Ferrari() {
        super("Ferrari", 2, 10000000, 8.0);
        frontHeight = 0.0;
        isLifted = false;
    }

    void liftUp() {
        if (!isLifted) {
            frontHeight += 40;
            acceleration *= 0.8;
            isLifted = true;
        } else {
            System.out.println("既にリフトアップしています。");
        }
    }

    void liftDown() {
        if (isLifted) {
            frontHeight -= 40;
            acceleration /= 0.8;
            isLifted = false;
        } else {
            System.out.println("リフトアップしていないため、リフトダウンできません。");
        }
    }
}
