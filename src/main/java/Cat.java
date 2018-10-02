public class Cat extends Animal implements Comparable<Cat>, CanRun, CanFly, CanSwim {

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
        return speed;
    }

    public void runCat() {
        System.out.println("Cat is running with speed = " + speed);
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
            System.out.println("Mum mum, Rat is thin!");
        } else if (catchRat(food) == true && food.getWeight() > 10) {
            System.out.println("Mum mum, Rat is fat!");
        } else System.out.println("Meo meo,hungry!");
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String fly() {
        return "Không bay được";
    }

    @Override
    public String swim() {
        return "Không thể bơi";
    }

    public String run() {
        return "Có thể chạy";
    }
}
