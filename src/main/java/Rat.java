public class Rat extends Animal implements Comparable<Rat>, CanRun, CanSwim {

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
        if (speed >= 0) {
            return speed;
        } else return speed = -1;
    }

    public int getWeight() {
        if (weight >= 0) {
            return weight;
        } else return weight = -1;
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
    public String canRun() {
        return "Có thể chạy";
    }

    @Override
    public String canSwim() {
        return "Có thể bơi";
    }
}
