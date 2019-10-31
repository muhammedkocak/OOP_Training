package demo;
import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        Random random = new Random();// evt (1)

        Random random2 = new Random();// evt (1)


        System.out.println(random.nextInt(10)+1);
        System.out.println(random2.nextInt(5)+5);









        /*int randomnumber = random.nextInt(10)+1;

        System.out.println(randomnumber);*/
    }
}
