import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDateSorter dateSorter = new Date();

        List<LocalDate> unsortedList = new ArrayList<>();
        unsortedList.add(LocalDate.of(2005, 07, 01));
        unsortedList.add(LocalDate.of(2005, 01, 02));
        unsortedList.add(LocalDate.of(2005, 01, 01));
        unsortedList.add(LocalDate.of(2005, 05, 03));
        unsortedList.add(LocalDate.of(2018, 04, 17));
        unsortedList.add(LocalDate.of(2012, 04, 21));
        unsortedList.add(LocalDate.of(2015, 03, 13));
        unsortedList.add(LocalDate.of(2020, 12, 11));

        System.out.println(dateSorter.sortDates(unsortedList));

    }
}
