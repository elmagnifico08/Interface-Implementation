import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Date implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> haveR = unsortedDates.stream()
                .filter(e -> e.getMonth().toString()
                        .contains(String.valueOf('R')))
                .sorted()
                .collect(Collectors.toList());

        List<LocalDate> noHaveR = unsortedDates.stream()
                .filter(e -> !e.getMonth().toString()
                        .contains(String.valueOf('R')))
                .sorted(Collections.reverseOrder()).toList();

        List<LocalDate> result = haveR;
        result.addAll(noHaveR);
        return result;
    }
}

