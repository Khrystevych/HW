package HW6;

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
        map.put("0", "The Great Gatsby");
        map.put("1", "Hamlet");
        map.put("2", "Moby Dick");
        map.put("3", "Don Quixote");
        map.put("4", "King Lear");
        return map;
    }

    public static void main(String[] args) {
        mapOfBooks();
    }
}


