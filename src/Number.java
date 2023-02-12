import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

    public static void numberVerification() {
        List<String> numbers = new ArrayList<>();
        numbers.add("+380664479986");
        numbers.add("+262664479986");
        numbers.add("490664479955");

        String regex = "^[+]380\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + ": " + matcher.matches());
        }
    }

    public static void main(String[] args) {
        numberVerification();
    }
}
