package demo;

public class StringDemo {
    public static void main(String[] args) {


       /* String text = new String("hello");


        String sameText = new String("hello");

        System.out.println(text.toUpperCase());*/

       String text = "saxofoon";
        System.out.println(text);
       text = text.toUpperCase();
       System.out.println(text);
       text = text.replace("o", "a");
       System.out.println(text);


       text = text.concat("is wat ik speel");
        System.out.println(text);

        StringBuilder stringBuilder = new StringBuilder("saxofoon");
        stringBuilder.append("is wat ik speel");
        System.out.println(stringBuilder);






    }
}
