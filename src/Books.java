import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Books {
    public static Map<String, String> mapOfBooks() {
        List<String> list = new ArrayList<>();
        list.add("The Great Gatsby");
        list.add("Hamlet");
        list.add("Moby Dick");
        list.add("Don Quixote");
        list.add("King Lear");

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(String.valueOf(i), list.get(i));
        }
        return map;
    }

    public static void main(String[] args) {
        mapOfBooks();
    }
}