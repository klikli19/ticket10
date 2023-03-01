import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] test = {"aa", "dd", "tt", "aa", "aa", "tt", "pp", "dd", "kk", "pp"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(test));
        String[] result = set.toArray(new String[0]);
        System.out.println(Arrays.toString(result));

        test = Arrays.stream(test).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(test));

    }
}