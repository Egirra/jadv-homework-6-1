import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String text = "I amar prestar aen, han mathon ne nen, han mathon ne chae a han noston ne ‘wilith";

        Function<String, List<String>> getDictionary = s -> Arrays.stream(s.split(" "))
                .map(m -> m.replaceAll("[,]", ""))
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(getDictionary.apply(text));
    }
}