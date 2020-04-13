package org.example.test.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author su
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
