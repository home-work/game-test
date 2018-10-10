import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GameRatAndCat {
    public static void main(String[] args) throws IOException {

        Cat tomCat = new Cat("Tom", 10);
        Rat jerryRat = new Rat("Jerry", 13, 10);
        tomCatchJerry(tomCat, jerryRat);

//        Tạo danh sách mèo và sắp xếp
        Cat tomCat_1 = new Cat("Tom_1", 10);
        Cat tomCat_2 = new Cat("Aom_2", 10);
        Cat tomCat_3 = new Cat("Wom_3", 5);
        Cat tomCat_4 = new Cat("Gom_4", 12);
        Cat tomCat_5 = new Cat("Hom_5", 7);

        List<Cat> cats = new ArrayList<>();
        cats.add(tomCat_1);
        cats.add(tomCat_2);
        cats.add(tomCat_3);
        cats.add(tomCat_4);
        cats.add(tomCat_5);

        System.out.println("\nDanh sách mèo sau khi được sắp xếp:");
        sortCats(cats);

//        Tạo danh sách chuột và sắp xếp
        Rat jerryRat_1 = new Rat("Jerry_1", 5, 10);
        Rat jerryRat_2 = new Rat("Aerry_2", 19, 10);
        Rat jerryRat_3 = new Rat("Zerry_3", 8, 5);
        Rat jerryRat_4 = new Rat("Ferry_4", 12, 7);
        Rat jerryRat_5 = new Rat("Merry_5", 17, 10);

        List<Rat> rats = new ArrayList<>();
        rats.add(jerryRat_1);
        rats.add(jerryRat_2);
        rats.add(jerryRat_3);
        rats.add(jerryRat_4);
        rats.add(jerryRat_5);

        System.out.println("\nDanh sách chuột sau khi được sắp xếp:");
        sortRats(rats);

//        Tìm chuột trong danh sách
        findRat(rats, "Jerry_2");

//        Thả mèo đi bắt hết chuột
        catsCatchRats(cats, rats);
    }


    private static void catsCatchRats(List listCats, List listRats) {
        File file;
        FileWriter fileWriter = null;
        String content = "";
        try {
            file = new File("E:/result_cat_catch_rat.txt");
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<Cat> iteratorCats_1 = listCats.iterator();
            while (iteratorCats_1.hasNext()) {
                Cat cat = iteratorCats_1.next();
                Iterator<Rat> iteratorRats_1 = listRats.iterator();
                while (iteratorRats_1.hasNext()) {
                    Rat rat = iteratorRats_1.next();
                    if (cat.catchRat(rat) == true) {
                        content = "Mèo " + cat.getName() + " với tốc độ " + cat.getSpeed() + " bắt được chuột " + rat.getName() + " với tốc độ " + cat.getSpeed();
                        bufferedWriter.write(content);
                        bufferedWriter.newLine();
                        iteratorRats_1.remove();
                    }
                }
            }
            System.out.println("\nĐã bắt hết chuột!");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findRat(List list, String nameRat) {
        Iterator<Rat> iterator = list.iterator();
        boolean checked = true;
        while (iterator.hasNext()) {
            Rat rat = iterator.next();
            if (rat.getName().compareTo(nameRat) == 0) {
                checked = true;
                break;
            } else checked = false;
        }
        if (checked) {
            System.out.println("\nCó con chuột " + nameRat);
        } else System.out.println("\nKhông có con chuột " + nameRat);
    }

    private static void sortRats(List list) {
        Collections.sort(list);
        Iterator<Rat> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    private static void sortCats(List list) {
        Collections.sort(list);
        Iterator<Cat> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    private static void tomCatchJerry(Cat cat, Rat rat) {
        boolean catchedRat = cat.catchRat(rat);
        if (catchedRat) {
            System.out.println("Mèo " + cat.getName() + " bắt được chuột " + rat.getName());
        } else {
            System.out.println("Mèo " + cat.getName() + " không bắt được chuột " + rat.getName());
        }
        cat.eat(rat);
    }
}
