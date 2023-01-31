import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(goForAWalk(generateRandomAge(),-8));
        System.out.println(goForAWalk(generateRandomAge(),23));
        System.out.println(goForAWalk(generateRandomAge(),-12));
        System.out.println(goForAWalk(generateRandomAge(),0));
        System.out.println(goForAWalk(generateRandomAge(),15));
    }
    public static  int generateRandomAge(){
        Random age1 = new Random();
        Random temp1 = new Random();
        int age = age1.nextInt(122);
        int temp = temp1.nextInt();
        return  age;
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
