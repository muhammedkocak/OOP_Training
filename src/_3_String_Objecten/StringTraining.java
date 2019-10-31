package _3_String_Objecten;

import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hallo, wat is je naam ?");
        String text = keyboard.next();

        System.out.println("Uw naam is : " + text);
        System.out.println(text + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.replace('a', 'o'));

        int count = 0;


        for(int i=0; i < text.length(); i++) {
           if(text.charAt(i) == 'e')
            count++;

        }
        System.out.println(count);

        String a = "Anders";
        String b = "Anders";
        String c = a;
        String d = b;
        String e = "Hello";

        System.out.println(a.equals(b));
        System.out.println(b.equals(d));
        System.out.println(c.equals(e));
        System.out.println(d.equals(e));

        int compare = a.compareTo(b);

        if (compare < 0) {
            //a is smaller
            System.out.println(a);
        }
        else if (compare > 0) {
            System.out.println(b);
            //a is larger
        }
        else {
            System.out.println(a+b);
            //a is equal to b
        }

        String nameWithspace = "   hallooo     ";
        System.out.println(nameWithspace);
        System.out.println(nameWithspace.trim());
        System.out.println(nameWithspace);






    }
}
