package simbirsoft.com;

import java.util.HashMap;
import java.util.Map;

public class Point {

    Map<Integer, Integer> map = new HashMap<>();

    Point() {
        System.out.println("Исходный вариант");
        map.put(2, 1);
        map.put(100, 3);
        map.put(10, 21);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}
