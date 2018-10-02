public class Rat extends Animal implements Comparable<Rat>, CanRun, CanSwim, CanFly {

    private String name;
    private int weight;
    private int speed;

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Rat name:" + name + "\nRat weight:" + weight + "\nRat speed" + speed;
    }

    public void runRat() {
        System.out.println("Rat is running with speed = " + speed);
    }

    @Override
    public int compareTo(Rat o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String fly() {
        return "Không thể bay";
    }

    @Override
    public String run() {
        return "Có thể chạy";
    }

    @Override
    public String swim() {
        return "Có thể bơi";
    }
}
