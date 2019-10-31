package _1_ObjectenMakenEnGebruiken;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        Random random2 = new Random();

        System.out.println(random.nextInt(10)+1);
        System.out.println(random2.nextInt(100)+1);
    }
}
