public class Cat extends Animal implements Comparable<Cat>, CanRun {

    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        if (speed >= 0) {
            return speed;
        } else return -1;
    }

    public void run() {
        System.out.println("Mèo đang chạy với tốc độ là: " + speed);
    }

    public boolean catchRat(Rat rat) {
        boolean catchedRat = true;

        if (speed == rat.getSpeed()) {
            catchedRat = true;
        } else {
            catchedRat = false;
        }
        return catchedRat;
    }

    public void eat(Rat food) {
        if (catchRat(food) == true && food.getWeight() < 10) {
            System.out.println("Mum mum, chuột hơi gầy");
        } else if (catchRat(food) == true && food.getWeight() > 10) {
            System.out.println("Mum mum, chuột béo đấy");
        } else System.out.println("Meo meo, đói");
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }

    public String canRun() {
        return "Có thể chạy";
    }
}
