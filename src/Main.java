import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Egor", "Danila", "Anton", "Pavel"));

        names = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .toList();

        System.out.println(names);
    }
}