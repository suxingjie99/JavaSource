package org.example.test.arraylist;


import java.util.Random;

/**
 * @author su
 */
public class ArrayListTest {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        System.out.println(sb);

    }


}
