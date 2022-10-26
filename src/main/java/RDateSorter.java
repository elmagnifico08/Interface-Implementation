import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RDateSorter implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> result = unsortedDates.stream()
                .filter(e -> e.getMonth().toString()
                        .contains("R"))
                .sorted()
                .collect(Collectors.toList());

        List<LocalDate> noHaveR = unsortedDates.stream()
                .filter(e -> !e.getMonth().toString()
                        .contains("R"))
                .sorted(Collections.reverseOrder()).toList();


        result.addAll(noHaveR);

        return result;
    }
}

