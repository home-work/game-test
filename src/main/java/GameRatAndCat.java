import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GameRatAndCat {
    public static void main(String[] args) {
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
        Cat tomCat_2 = new Cat("Aom_2", 20);
        Cat tomCat_3 = new Cat("Wom_3", 15);
        Cat tomCat_4 = new Cat("Gom_4", 12);
        Cat tomCat_5 = new Cat("Hom_5", 7);

        Rat jerryRat_1 = new Rat("Jerry_1", 5, 15);
        Rat jerryRat_2 = new Rat("Aerry_2", 19, 12);
        Rat jerryRat_3 = new Rat("Zerry_3", 8, 5);
        Rat jerryRat_4 = new Rat("Ferry_4", 12, 6);
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


    }
}
