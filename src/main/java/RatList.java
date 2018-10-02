import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RatList {
    private List<Rat> rats = new ArrayList<>();

    public void find(List<Rat> rats, String nameRat) {
        Iterator<Rat> iterator = rats.iterator();
        boolean checked = true;
        while (iterator.hasNext()) {
            Rat rat = (Rat) iterator.next();
            if (rat.getName().compareTo(nameRat) == 0) {
                checked = true;
                break;
            } else checked = false;
        }
        if (checked) {
            System.out.println("Có con chuột " + nameRat);
        } else System.out.println("Không có con chuột " + nameRat);
    }
}
