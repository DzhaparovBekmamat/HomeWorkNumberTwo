import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(goForAWalk(30, 24));
        System.out.println(goForAWalk(20, 12));
        System.out.println(goForAWalk(46, 33));
        System.out.println(goForAWalk(21, 24));
        System.out.println(goForAWalk(60, -12));
    }
    public static String goForAWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять, ура !";
        } else {
            return "Оставайтесь дома, пожалуйста";
        }


    }
}
