import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDateSorter dateSorter = new RDateSorter();

        List<LocalDate> unsortedList = new ArrayList<>();
        unsortedList.add(LocalDate.of(2005, 7, 1));
        unsortedList.add(LocalDate.of(2005, 1, 2));
        unsortedList.add(LocalDate.of(2005, 1, 1));
        unsortedList.add(LocalDate.of(2005, 5, 3));
        unsortedList.add(LocalDate.of(2018, 4, 17));
        unsortedList.add(LocalDate.of(2012, 9, 21));
        unsortedList.add(LocalDate.of(2015, 3, 13));
        unsortedList.add(LocalDate.of(2020, 12, 11));

        System.out.println(dateSorter.sortDates(unsortedList));

    }
}
