package org.example.test.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author su
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"lisi");
        map.put(4,"lisi");
        map.put(5,"lisi");
        map.put(6,"lisi");
        map.put(7,"lisi");
        map.put(8,"lisi");
        map.put(9,"lisi");
        map.put(10,"lisi");
        map.put(11,"lisi");
        map.put(12,"lisi");
        map.put(13,"lisi");
        String s = map.get(1);
        System.out.println(s);
    }

}
