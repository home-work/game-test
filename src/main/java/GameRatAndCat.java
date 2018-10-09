import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GameRatAndCat {
    public static void main(String[] args) throws IOException {
        Cat tomCat = new Cat("Tom", 10);
        Rat jerryRat = new Rat("Jerry", 13, 10);

        boolean catechedRat = tomCat.catchRat(jerryRat);
        if (catechedRat) {
            System.out.println("Cat catched Rat -_-!");
        } else {
            System.out.println("Cat didn't Rat ^^!");
        }

        tomCat.eat(jerryRat);

        Cat tomCat_1 = new Cat("Tom_1", 10);
        Cat tomCat_2 = new Cat("Aom_2", 10);
        Cat tomCat_3 = new Cat("Wom_3", 5);
        Cat tomCat_4 = new Cat("Gom_4", 12);
        Cat tomCat_5 = new Cat("Hom_5", 7);

        Rat jerryRat_1 = new Rat("Jerry_1", 5, 10);
        Rat jerryRat_2 = new Rat("Aerry_2", 19, 10);
        Rat jerryRat_3 = new Rat("Zerry_3", 8, 5);
        Rat jerryRat_4 = new Rat("Ferry_4", 12, 7);
        Rat jerryRat_5 = new Rat("Merry_5", 17, 10);


        System.out.println("Danh sách chuột sau khi được sắp xếp:");
        List<Rat> rats = new ArrayList<>();

        rats.add(jerryRat_1);
        rats.add(jerryRat_2);
        rats.add(jerryRat_3);
        rats.add(jerryRat_4);
        rats.add(jerryRat_5);


        Collections.sort(rats);
        Iterator<Rat> iteratorRats = rats.iterator();
        while (iteratorRats.hasNext()) {
            System.out.println(iteratorRats.next().getName());
        }

        RatList ratList = new RatList();
        ratList.find(rats, "Jerry_2");

        System.out.println("\nDanh sách mèo sau khi được sắp xếp:");

        List<Cat> cats = new ArrayList<>();

        cats.add(tomCat_1);
        cats.add(tomCat_2);
        cats.add(tomCat_3);
        cats.add(tomCat_4);
        cats.add(tomCat_5);

        Collections.sort(cats);
        Iterator<Cat> iteratorCats = cats.iterator();
        while (iteratorCats.hasNext()) {
            System.out.println(iteratorCats.next().getName());
        }

        File file;
        FileWriter fileWriter = null;
        try {
            file = new File("E:/CatCatchRat.txt");
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Iterator<Cat> iteratorCats_1 = cats.iterator();
        while (iteratorCats_1.hasNext()) {
            Cat cat =  iteratorCats_1.next();
            Iterator<Rat> iteratorRats_1 = rats.iterator();
            while (iteratorRats_1.hasNext()) {
                Rat rat =  iteratorRats_1.next();
                if (cat.catchRat(rat) == true) {
                    System.out.println(cat.getName() + "bắt được chuột " + rat.getName());
                    fileWriter.write("\n" + cat.getName() + "bắt được chuột " + rat.getName());
                    iteratorRats_1.remove();
                }
            }
        }
        fileWriter.close();
    }
}
